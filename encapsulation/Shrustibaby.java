public class Shrustibaby
{
public static void main(String args[])
{
Exam exam=new Exam();
exam.setExamid(Integer.parseInt(args[0]));
exam.setExamtype(args[1]);
exam.setExamfee(Double.parseDouble(args[2]));
System.out.println("examid="+exam.getexamid());
System.out.println("examtype="+exam.getexamtype());
System.out.println("examfee="+exam.getexamfee());
}
}