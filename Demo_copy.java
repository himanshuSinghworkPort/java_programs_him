import java.io.*;
class Demo_copy{
public static void main(String[] args){

int ch;
FileInputStream fin = null;
FileOutputStream fout = null;

try{
fin =new FileInputStream("in.txt");
fout = new FileOutputStream("out.txt");

while((ch = fin.read()) != -1)

fout.write(ch);
}
catch(IOException e){
e.printStackTrace();
}

finally{
try{	
fin.close();
fout.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}
}