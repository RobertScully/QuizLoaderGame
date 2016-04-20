import processing.core.*;

public class Questions{
	PApplet parent;
	
	boolean answered=false;//Boolean to check if a question has been answered.
	String questiontxt, a1,a2,a3,a4;
	String res1,res2,res3,res4;
	
	
	Questions(PApplet p, String qt,String text1,String text2,String text3,String text4,String answer1,String answer2,String answer3,String answer4){
		parent=p;
		questiontxt=qt;
		a1=text1;
		a2=text2;
		a3=text3;
		a4=text4;
		res1=answer1;
		res2=answer2;
		res3=answer3;
		res4=answer4;
	}
	
	public void qdisplay(){
		parent.fill(246, 177, 85);
		parent.text(questiontxt, 20,250);
		parent.text(a1,20, 420);
		parent.text(a2,20, 470);
		parent.text(a3,20, 520);
		parent.text(a4,20, 570);
	}
	
	public String applyValues1(){
		return res1;
	}
	public String applyValues2(){
		return res2;
	}
	public String applyValues3(){
		return res3;
	}
	public String applyValues4(){
		return res4;
	}
}
