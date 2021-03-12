import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class HelloWorld {
    public int buffered_reader () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age : ");
        return Integer.parseInt(reader.readLine());
    }

    public void string_tokenizer () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your details [first name, last name, age ]");
        String input = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        String first_name = tokenizer.nextToken();
        String last_name = tokenizer.nextToken();
        int age = Integer.parseInt(tokenizer.nextToken());

        System.out.println("[ "+first_name+" "+last_name+" "+age+" ]");

    }

    public int scanner () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void input_output() throws IOException{

        try (FileInputStream in = new FileInputStream("input.txt"); FileOutputStream out = new FileOutputStream("output.txt")) {
            int c;
            while ((c = in.read()) != -1) out.write(c);
        }
    }

    public void the_string_class(){
        StringBuilder one = new StringBuilder("acd");
        one.append("e");
        one.insert(1, "b");
        one.replace(0, 3, "ABCD");
        one.reverse();
        System.out.println(one);
    }

    public static void main(String[] args) throws IOException {
        HelloWorld app = new HelloWorld();
        app.the_string_class();
    }
}
