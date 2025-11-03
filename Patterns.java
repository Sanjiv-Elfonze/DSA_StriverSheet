 import java.util.*;


 class Main {
public static void main(String[] args) {
int number;
char chr = '*';
System.out.println("Enter the number: ");
Scanner sc = new Scanner(System.in);
number = sc.nextInt();
// quest1(number, chr);
// quest2(number,chr);
// quest3(number);
// quest4(number);
// quest5(number,  chr);
// quest6(number);
// quest7(number , chr); //-> input is number of rows, not base
// quest8(number, chr);
// quest9(number, chr);
// quest10(number, chr);
// quest11(number);
// quest12(number);
// quest13(number);
// quest14(number);
// quest15(number);
// quest16(number);
// quest17(number);
// quest18(number);
// quest19(number, chr);
quest20(number, chr);

}
 

static void quest1(int number, char charecter) {
    //rows
    for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
            System.out.print(charecter + " ");
        }
        System.out.println("");
    }
}

static void quest2(int number, char ch) {
    // first loop always for number of rows
    for (int i = 1; i <= number; i++) {
        //second loop for columns in each row
        for (int j = 1; j <= i; j++) {
            System.out.print(ch + " ");
        }
        System.out.println("");
    }
}

static void quest3(int number) {
    // first rows
    for (int i = 1; i <= number; i++) {
        // what to fill in column of each row
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println("");
    }
}

static void quest4(int number) {
    // again rows
    for (int i = 1; i <= number; i++) {
        // for columns
        for (int j = 0; j < i; j++) {
            System.out.print(i);
        }
        System.out.println("");
    }
}

static void quest5(int number, char chr) {
    for (int i = 1; i <= number; i++) {
        // can remove the plus 1 if we had i start from 0 logic in our row loop!!!
        for (int j = number - i + 1; j > 0; j--) {
            System.out.print(chr + " ");
        }
        System.out.println("");
    }
}

static void quest6(int number) {
    for (int i = 0; i < number; i++) {
        for (int j = 1; j <= number - i; j++) {
            System.out.print(j);
        }
        System.out.println("");
    }
}

static void quest7(int number, char chr) {
    //UPDATE: I DID IT ON MY OWN!!!!!!!! DAMN SIKE BRO
    // first is the number of rows,
    for (int i = 0; i < number; i++) {
        // in this case, the column has 'SPACES' and 'CHARS'
        // we gotta derive logic for both (did it on me own!)
        // first spaces
        for (int j = 1; j < number - i; j++) {
            System.out.print(" ");
        }
        // for stars
        for (int j = 1; j <= ((i + 1) * 2 - 1); j++) {
            System.out.print(chr);
        }
        System.out.println("");
    }
}

static void quest8(int number, char chr) {
    // UPDATE: 'READ SOLN BEOFRE READING UPDATE
    // WE CAN SOLVE WITHOUT USING INTERMEDIATE VARIABLE
    // BY USING THE LOGIC ```(2*number-(i*2-1))```
    //THAT IS IF WE USE i=1 IN THE FIRST LOOP'
    int intermediate = (number * 2) - 1;
    // first for rows
    for (int i = 1; i <= number; i++) {
        // now for spaces
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        // for chars printing
        for (int j = 0; j < intermediate; j++) {
            System.out.print(chr);
        }
        System.out.println("");
        intermediate -= 2;
    }
}

static void quest9(int number, char chr) {
    //basically mix of question 7 and question 8, literally
    quest7(number, chr);
    quest8(number, chr);
}

static void quest10(int number, char chr) {
    // increasing
    for (int i = 0; i < number; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(chr);
        }
        System.out.println("");
    }
    // decreasing
    for (int i = number - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print(chr);
        }
        System.out.println("");
    }
}

//----------challenge starts---------------------

static void quest11(int number){
    
    for (int i=1;i<=number;i++){
    
    int count=0;
    int prev;
    // ODD LOGIC
    if (i%2!=0){
        count = i;
        prev=0;
        while (count >0){
            
            if (prev==0){
                System.out.print("1 ");
                count-=1;
                prev=1;
            }
            else{
                System.out.print("0 ");
                count-=1;
                prev=0;
            }
            
        }
        
        System.out.println("");
        

    }
    
    //EVEN LOGIC
    else{
        count=i;
        prev=1;
        
        while (count > 0){
            
            if (prev==0){
                System.out.print("1 ");
                count-=1;
                prev=1;
            }
            else{
                System.out.print("0 ");
                count-=1;
                prev=0;
            }
            
        }
        
        System.out.println("");
    }
    
    
    }
    
}

static void quest12(int number){
    
    // first print the rows
    for (int i=1;i<=number;i++){
        
        // onto the columns
        for (int j=1;j<=i;j++){
            // print the first set 
            System.out.print(j);
   
        }
        for (int j=1;j<=2*(number-i);j++){
            // print spaces
            System.out.print(" ");
        }
        
         for (int j=i;j>=1;j--){
            // print last set
            System.out.print(j);
   
        }
        
        System.out.println("");
        
    }
    
    
}

static void quest13(int number){
    int last=1;
    
    // for rows
    for (int i=1;i<=number;i++){
        
        for (int j=1;j<=i;j++){
            System.out.print((last++)+" ");
            
        }
        System.out.println("");
    }
    
    
}

static void quest14(int number){
    
    //for rows
    for (int i=1;i<=number;i++){
        char letter='A';
        // for columns
        for (int j=1;j<=i;j++){
            System.out.print((letter++));
        }
        
        System.out.println("");
    }
    
}

static void quest15(int number){
    
    // for rows
    for (int i=number;i>=1;i--){
        char letter='A';
        // for columns
        for (int j=i;j>=1;j--){
            System.out.print((letter++));
        }
        
        System.out.println("");
    }
}

static void quest16(int number){
    char letter = 'A';
    // for rows
    for (int i=1;i<=number;i++){
        // for columns
        for (int j=1;j<=i;j++){
            System.out.print(letter);
        }
        letter++;
        System.out.println("");
    }
}

static void quest17(int number){
    
    // for rows
    // STEPS:
        // ---> PRINT SPACES
        // --> PRINT LETTERS
        // --> DO SOME SHIT TO REVERSE THEM
    for (int i=1;i<=number;i++){
        char letter ='A';
        
        // first for the spaces
        for (int j=1;j<=number-i;j++){
            System.out.print(" ");
        }
        
        // next we print letters
        for (int j=1;j<=i;j++){
            System.out.print((letter++));
        }
        
        letter-=2; // we do '-2' here because of the previous loop at the end , we already increment by 1 , so doing '-1' alone will bring it back to its previous state but we want one below that, since we dont want middle letters repeating
        
        // print that letter is reverse
        for (int j=1;j<i;j++){
            System.out.print((letter--));
        }
        
        System.out.println(" ");
        
    }
}

static void quest18(int number){
    
    // I DID IT ON MY OWN!!!
    
    // for rows
    for (int i=1;i<=number;i++){
        char letter = 'A';
        letter+=number-i;
        // for cols
        for (int j=1;j<=i;j++){
            System.out.print((letter++)+" ");
        }
        
        System.out.println("");
    }
    
}

static void quest19(int number, char chr){
    
    // DID IT ON MY OWN AGAIN!!!!!!!!!!
    
    // input is number of rows per dec or inc
    // so if total rows = 10, input rows = 5
    
    // decreasing
    for (int i=1;i<=number;i++){
        // print chars
        for (int j=1;j<=(2*(number-i+1))/2;j++){
            System.out.print(chr);
        }
        
        // print spaces
        for (int j=1;j<=2*(i-1);j++){
            System.out.print(" ");
        }
        
        //print remaining chars
        for (int j=1;j<=(2*(number-i+1))/2;j++){
            System.out.print(chr);
        }
        
        System.out.println(" ");
    }
    
    // increasing part
    for (int i=1;i<=number;i++){
        
        // print chars
        for (int j=1;j<=i;j++){
            System.out.print(chr);
        }
        
        // print spaces
        for (int j=1;j<=2*(number-i);j++){
            System.out.print(" ");
        }
        
        //print chars again
        for (int j=1;j<=i;j++){
            System.out.print(chr);
        }
        
        System.out.println(" ");
    }
    
    
}

static void quest20(int number, char chr){
    
    
}
 

 }
