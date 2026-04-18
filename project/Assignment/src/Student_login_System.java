
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.function.*;

// ============================================================
//   STUDENT LOGIN SYSTEM  |  Advanced Java Implementation
//   Version : 2.0  |  OOP + Design Patterns + ANSI Console
// ============================================================

public class Student_login_System {

    // ─────────────────────────────────────────
    //  ANSI COLOR CONSTANTS  (Terminal Styling)
    // ─────────────────────────────────────────
    static final String RESET  = "\u001B[0m";
    static final String BOLD   = "\u001B[1m";
    static final String RED    = "\u001B[31m";
    static final String GREEN  = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE   = "\u001B[34m";
    static final String CYAN   = "\u001B[36m";
    static final String WHITE  = "\u001B[37m";

    // ─────────────────────────────────────────
    //  CUSTOM EXCEPTION HIERARCHY
    // ─────────────────────────────────────────
    static class AuthException extends Exception {
        private final int attemptsLeft;
        AuthException(String msg, int attemptsLeft) {
            super(msg);
            this.attemptsLeft = attemptsLeft;
        }
        int getAttemptsLeft() { return attemptsLeft; }
    }

    static class MaxAttemptsException extends AuthException {
        MaxAttemptsException() { super("Maximum login attempts exceeded.", 0); }
    }

    static class InvalidOperationException extends RuntimeException {
        InvalidOperationException(int choice) {
            super("Invalid menu option: " + choice + ". Expected 1-4.");
        }
    }

    // ─────────────────────────────────────────
    //  STRATEGY PATTERN  (Arithmetic Operations)
    // ─────────────────────────────────────────
    @FunctionalInterface
    interface MathOperation {
        double execute(double a, double b);
    }

    enum Operation {
        ADDITION      ("+", (a, b) -> a + b),
        SUBTRACTION   ("-", (a, b) -> a - b),
        MULTIPLICATION("x", (a, b) -> a * b);

        final String symbol;
        final MathOperation strategy;

        Operation(String symbol, MathOperation strategy) {
            this.symbol   = symbol;
            this.strategy = strategy;
        }

        double apply(double a, double b) { return strategy.execute(a, b); }
    }

    // ─────────────────────────────────────────
    //  SINGLETON PATTERN  (Session Manager)
    // ─────────────────────────────────────────
    static class SessionManager {
        private static SessionManager instance;
        private final String loggedInUser;
        private final LocalDateTime loginTime;
        private int operationsPerformed = 0;

        private SessionManager(String user) {
            this.loggedInUser = user;
            this.loginTime    = LocalDateTime.now();
        }

        static SessionManager create(String user) {
            instance = new SessionManager(user);
            return instance;
        }

        static SessionManager getInstance() {
            if (instance == null) throw new IllegalStateException("No active session.");
            return instance;
        }

        void recordOperation()  { operationsPerformed++; }
        String getUser()        { return loggedInUser; }
        int    getOpsCount()    { return operationsPerformed; }

        String getLoginTime() {
            return loginTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        }
    }

    // ─────────────────────────────────────────
    //  BUILDER PATTERN  (Result Report)
    // ─────────────────────────────────────────
    static class ResultReport {
        private final double num1, num2, result;
        private final Operation op;
        private final int opNumber;

        private ResultReport(Builder b) {
            this.num1     = b.num1;
            this.num2     = b.num2;
            this.result   = b.result;
            this.op       = b.op;
            this.opNumber = b.opNumber;
        }

        void print() {
            String formatted = (result == (long) result)
                    ? String.valueOf((long) result)
                    : String.format("%.4f", result);

            System.out.println(CYAN + "  +----------------------------------+" + RESET);
            System.out.printf (CYAN + "  |" + RESET + BOLD + WHITE +
                    "  Operation #%-2d  %-18s  " + RESET + CYAN + "|%n" + RESET,
                    opNumber,
                    op.name().charAt(0) + op.name().substring(1).toLowerCase());
            System.out.printf (CYAN + "  |" + RESET +
                    "  %s %s %s  =  " + GREEN + BOLD + "%-12s" + RESET + CYAN + "       |%n" + RESET,
                    formatNum(num1), op.symbol, formatNum(num2), formatted);
            System.out.println(CYAN + "  +----------------------------------+" + RESET);
        }

        static class Builder {
            double num1, num2, result;
            Operation op;
            int opNumber;

            Builder nums(double a, double b)   { num1 = a; num2 = b; return this; }
            Builder operation(Operation o)     { op = o; return this; }
            Builder result(double r)           { result = r; return this; }
            Builder opNumber(int n)            { opNumber = n; return this; }
            ResultReport build()               { return new ResultReport(this); }
        }
    }

    // ─────────────────────────────────────────
    //  UTILITY HELPERS
    // ─────────────────────────────────────────
    static String formatNum(double v) {
        return (v == (long) v) ? String.valueOf((long) v) : String.valueOf(v);
    }

    static void printBanner() {
        System.out.println(BOLD + BLUE);
        System.out.println("  +==============================================+");
        System.out.println("  |      STUDENT  LOGIN  SYSTEM  v2.0          |");
        System.out.println("  |      Java OOP  |  Design Patterns          |");
        System.out.println("  +==============================================+");
        System.out.println(RESET);
    }

    static void printSectionHeader(String title) {
        System.out.println();
        int dashes = Math.max(0, 36 - title.length());
        System.out.println(YELLOW + BOLD + "  -- " + title + " " + "-".repeat(dashes) + RESET);
    }

    static void printSuccess(String msg) { System.out.println(GREEN + BOLD + "  [OK]  " + msg + RESET); }
    static void printError(String msg)   { System.out.println(RED   + BOLD + "  [!!]  " + msg + RESET); }
    static void printInfo(String msg)    { System.out.println(CYAN  +        "  [>>]  " + msg + RESET); }
    static void printPrompt(String label){ System.out.print(WHITE + BOLD + "  > " + label + ": " + RESET); }

    static void printProgressBar(int current, int max) {
        int filled = (int) ((double) current / max * 20);
        System.out.print(RED + "  [");
        for (int i = 0; i < 20; i++)
            System.out.print(i < filled ? "#" : ".");
        System.out.println("] " + current + "/" + max + " attempts used" + RESET);
    }

    // ─────────────────────────────────────────
    //  MODULE 1 — AUTHENTICATION
    // ─────────────────────────────────────────
    static final String VALID_USER = "student";
    static final String VALID_PASS = "btech123";
    static final int    MAX_LOGIN  = 3;

    static SessionManager login(Scanner sc) throws MaxAttemptsException {
        printSectionHeader("AUTHENTICATION MODULE");

        for (int attempt = 1; attempt <= MAX_LOGIN; attempt++) {
            System.out.println();
            printInfo("Attempt " + attempt + " of " + MAX_LOGIN);
            printProgressBar(attempt - 1, MAX_LOGIN);
            System.out.println();

            try {
                printPrompt("Username");
                String user = sc.nextLine().trim();

                printPrompt("Password");
                String pass = sc.nextLine().trim();

                // Core validation using String.equals()
                if (!VALID_USER.equals(user) || !VALID_PASS.equals(pass)) {
                    throw new AuthException("Invalid credentials.", MAX_LOGIN - attempt);
                }

                System.out.println();
                printSuccess("Login Successful!  Welcome, " + user.toUpperCase() + "!");
                printInfo("Session started at " +
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
                return SessionManager.create(user);

            } catch (AuthException e) {
                printError(e.getMessage());
                if (e.getAttemptsLeft() > 0) {
                    printInfo(e.getAttemptsLeft() + " attempt(s) remaining.");
                }
            }
        }

        throw new MaxAttemptsException();
    }

    // ─────────────────────────────────────────
    //  MODULE 2 — ARITHMETIC (MENU-DRIVEN)
    // ─────────────────────────────────────────
    static void arithmeticOperation(Scanner sc, SessionManager session) {
        printSectionHeader("ARITHMETIC OPERATIONS MODULE");
        printInfo("Logged in as: " + session.getUser().toUpperCase());

        double num1 = readDouble(sc, "Enter First Number ");
        double num2 = readDouble(sc, "Enter Second Number");

        System.out.println();
        printInfo("Numbers locked -> A = " + formatNum(num1) + "  |  B = " + formatNum(num2));

        boolean running = true;

        while (running) {
            printMenu();

            try {
                printPrompt("Choose Option (1-4)");
                int choice = Integer.parseInt(sc.nextLine().trim());

                switch (choice) {
                    case 1: performOp(Operation.ADDITION,       num1, num2, session); break;
                    case 2: performOp(Operation.SUBTRACTION,    num1, num2, session); break;
                    case 3: performOp(Operation.MULTIPLICATION, num1, num2, session); break;
                    case 4: running = false; break;
                    default: throw new InvalidOperationException(choice);
                }

            } catch (NumberFormatException e) {
                printError("InputMismatchException -> Please enter a number (1-4).");
            } catch (InvalidOperationException e) {
                printError(e.getMessage());
            }
        }

        printSessionSummary(session);
    }

    static void performOp(Operation op, double a, double b, SessionManager session) {
        double result = op.apply(a, b);
        session.recordOperation();

        new ResultReport.Builder()
                .nums(a, b)
                .operation(op)
                .result(result)
                .opNumber(session.getOpsCount())
                .build()
                .print();
    }

    static double readDouble(Scanner sc, String label) {
        while (true) {
            try {
                printPrompt(label);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                printError("Invalid input. Please enter a valid number.");
            }
        }
    }

    static void printMenu() {
        System.out.println();
        System.out.println(BOLD + WHITE + "  +-----------------------------+" + RESET);
        System.out.println(BOLD + WHITE + "  |      OPERATIONS MENU       |" + RESET);
        System.out.println(BOLD + WHITE + "  +-----------+-----------------+" + RESET);
        System.out.println(WHITE        + "  |  [1]      Addition  ( + )   |" + RESET);
        System.out.println(WHITE        + "  |  [2]   Subtraction  ( - )   |" + RESET);
        System.out.println(WHITE        + "  |  [3] Multiplication ( x )   |" + RESET);
        System.out.println(RED          + "  |  [4]           Exit         |" + RESET);
        System.out.println(BOLD + WHITE + "  +-----------------------------+" + RESET);
    }

    static void printSessionSummary(SessionManager session) {
        System.out.println();
        System.out.println(CYAN + BOLD + "  +========= SESSION SUMMARY =========+" + RESET);
        System.out.printf (CYAN +        "  |  User       : %-22s|%n" + RESET, session.getUser());
        System.out.printf (CYAN +        "  |  Login At   : %-22s|%n" + RESET, session.getLoginTime());
        System.out.printf (CYAN +        "  |  Operations : %-22s|%n" + RESET, session.getOpsCount() + " completed");
        System.out.println(CYAN + BOLD + "  +====================================+" + RESET);
        System.out.println();
        printSuccess("Thank you for using the system. Goodbye!");
    }

    // ─────────────────────────────────────────
    //  MAIN ENTRY POINT
    // ─────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printBanner();

        try {
            SessionManager session = login(sc);
            arithmeticOperation(sc, session);

        } catch (MaxAttemptsException e) {
            System.out.println();
            printError("Access Denied. " + e.getMessage());
            printError("Program terminated for security reasons.");

        } finally {
            sc.close();
            System.out.println();
            System.out.println(BLUE + "  [System] Resources released. Session closed." + RESET);
        }
    }
}