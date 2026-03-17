// ========================================================
// Java Notes - JDK vs JRE vs JVM
// Description   : Explains the relationship between JDK,
//                 JRE, and JVM in Java ecosystem.
// ========================================================

public class JDK_JRE_JVM_Example {

    public static void main(String[] args) {

        // This program is only for understanding concepts.
        // No execution logic is required.

        System.out.println("JDK, JRE, JVM Concept");

        // ------------------- JVM (Java Virtual Machine) -------------------
        // JVM is the engine that executes Java bytecode.

        // Key Points:
        // 1. Converts bytecode into machine code
        // 2. Platform dependent (different JVM for each OS)
        // 3. Enables platform independence (Write Once, Run Anywhere)

        // ------------------- JRE (Java Runtime Environment) -------------------
        // JRE provides environment to run Java programs.

        // Components:
        // 1. JVM
        // 2. Libraries (predefined classes, APIs)

        // Usage:
        // Needed only to RUN Java applications

        // ------------------- JDK (Java Development Kit) -------------------
        // JDK is used to DEVELOP Java applications.

        // Components:
        // 1. JRE
        // 2. Development tools (compiler, debugger)

        // Example Tools:
        // javac → compiler
        // java  → run program

        // ------------------- Relationship -------------------
        // JDK = JRE + Development Tools
        // JRE = JVM + Libraries
        // JVM = Executes bytecode

        // Flow:
        // .java file → (javac) → .class (bytecode)
        // .class → (JVM) → machine code → output

        // ------------------- Key Concept -------------------
        // JDK → for building (developer)
        // JRE → for running (user)
        // JVM → core engine (execution)

        // ------------------- Advantages -------------------
        // 1. Platform independence (Write Once Run Anywhere)
        // 2. Secure execution through JVM
        // 3. Rich standard libraries
        // 4. Easy development with tools

        // ------------------- Disadvantages -------------------
        // 1. Requires JVM installation on each system
        // 2. Slightly slower than native languages (due to JVM layer)
        // 3. Memory consumption is higher

        // ------------------- Expected Understanding -------------------
        // JDK → Develop
        // JRE → Run
        // JVM → Execute

    }
}
