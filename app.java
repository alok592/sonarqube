cat > src/main/java/com/example/App.java <<'EOF'
package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("SonarQube Jenkins Demo");
    }

    public int add(int a, int b) {
        return a + b;
    }
}
EOF
