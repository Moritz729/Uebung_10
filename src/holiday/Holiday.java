//\\
///\\\
////\\\\
/////\\\\\
//////\\\\\\
///////\\\\\\\
package holiday;
import java.util.*;
public class Holiday {
private static Random rand
= new Random();public static
void main(String[] args) { int
height=15; System.out.println();
printTree(height);} private static
void printTree(int height){int width
=height*2- 1;printCentered("*",width);
for(int i=1;i<=height;i++) {StringBuilder
row =new StringBuilder();int leaves = i * 2- 1;for (int j = 0; j<leaves; j++) { if (rand.
nextInt(Math.max(6,12))==0){row.append(ornament
()); } else { row.append("#");}}printCentered(row.
toString(), width); } int trunkHeight = Math.max(1,
height / 4); for (int t = 0; t < trunkHeight; t++) {
printCentered("|||||", width); } System.out.println();
printCentered("MERRY CHRISTMAS FROM PK TEAM 25!", width);
} private static void printCentered(String s, int width){int
spaces = (width- s.length())/2; System.out.println(repeat(" ",
Math.max(0,spaces)) + s); } private static String repeat(String
s, int times) { StringBuilder sb = new StringBuilder(); for (int i
= 0; i < times; i++) {sb.append(s);} return sb.toString(); } private
static String ornament() { char[] ornaments = { 'o', '*', '@', '0' } ;
return String.valueOf(
ornaments [rand.nextInt
(ornaments.length)]);
}}
//Thank you (: 


