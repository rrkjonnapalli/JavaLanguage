import java.util.Random;
enum enumAnswers{
	NO,YES,MAYBE,LATER,SOON,NEVER;
}
class enumQuestion{
	Random rand = new Random();
	enumAnswers ask(){
		int prob = (int)(100*rand.nextDouble());
		if(prob<15)
			return enumAnswers.MAYBE;
		else if(prob<30)
			return enumAnswers.NO;
		else if(prob<60)
			return enumAnswers.YES;
		else if(prob<75)
			return enumAnswers.LATER;
		else if(prob<98)
			return enumAnswers.SOON;
		else
			return enumAnswers.NEVER;
	}
}
public class enumQuestionDemo {
	static void answers(enumAnswers result){
		switch(result){
		case NO:	System.out.println("NO");	break;
		case YES:	System.out.println("YES");	break;
		case MAYBE:	System.out.println("MAYBE");break;
		case LATER:	System.out.println("LATER");break;
		case SOON:	System.out.println("SOON");	break;
		case NEVER:	System.out.println("NEVER");break;
		}
	}
	public static void main(String args[]){
		enumQuestion q = new enumQuestion();
		answers(q.ask());
		answers(q.ask());
		answers(q.ask());
		answers(q.ask());
		answers(q.ask());
		answers(q.ask());
	}
}
