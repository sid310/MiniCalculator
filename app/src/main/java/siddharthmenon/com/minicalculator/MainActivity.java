package siddharthmenon.com.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    char stack1[]=new char[20];
    int top;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonequal,buttonadd,
    buttonsub,buttonmult,buttondiv,buttonclr,buttonpoint,buttondelete;
    TextView textView1,textView2;float ans=0.0f;
    float no,n1,n2,np,div;int decpoint,noval,opcount;

    String s;char op;
    void number(int x)
    {
        no=(no*10)+x;
    }
    void decimal(int y){np=np + (y/div);
                    div=div*10;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s="";opcount=0;
        div=10;noval=0;
        decpoint=0;
        button0=(Button)findViewById(R.id.b0);button1=(Button)findViewById(R.id.b1);button2=(Button)findViewById(R.id.b2);button3=(Button)findViewById(R.id.b3);button4=(Button)findViewById(R.id.b4);button5=(Button)findViewById(R.id.b5);button6=(Button)findViewById(R.id.b6);button7=(Button)findViewById(R.id.b7);button8=(Button)findViewById(R.id.b8);button9=(Button)findViewById(R.id.b9);buttonequal=(Button)findViewById(R.id.bequal);buttonadd=(Button)findViewById(R.id.badd);buttonsub=(Button)findViewById(R.id.bsub);buttonmult=(Button)findViewById(R.id.bmultiply);buttondiv=(Button)findViewById(R.id.bdivide);
        textView1=(TextView)findViewById(R.id.tv1);textView2=(TextView)findViewById(R.id.tv2);
        buttonclr=(Button)findViewById(R.id.clear);buttonpoint=(Button)findViewById(R.id.bpoint);buttondelete=(Button) findViewById(R.id.delete);
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.substring(s.length()-1,s.length()).compareTo(".")==0)
                {decpoint=0;np=0;}
             else   if(decpoint==1 && (s.substring(s.length()-1,s.length())).compareTo(".")!=0&& s.substring(s.length()-1,s.length()).compareTo("+")!=0 && s.substring(s.length()-1,s.length()).compareTo("-")!=0 && s.substring(s.length()-1,s.length()).compareTo("*")!=0 && s.substring(s.length()-1,s.length()).compareTo("/")!=0)
                {           div=div/10;
                            np=np - ((Integer.parseInt(s.substring(s.length()-1,s.length())))/div);}
             else   if(decpoint==0 && (s.substring(s.length()-1,s.length()).compareTo(".")!=0 && s.substring(s.length()-1,s.length()).compareTo("+")!=0 && s.substring(s.length()-1,s.length()).compareTo("-")!=0 && s.substring(s.length()-1,s.length()).compareTo("*")!=0 && s.substring(s.length()-1,s.length()).compareTo("/")!=0))
                            {no=(int)no/10;}

                s=s.substring(0,s.length()-1);
                textView1.setText(s);
            }
        });
        buttonpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decpoint=1;noval=0;
                s=s+".";
                textView1.setText(s);

            }
        });
        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noval==1)
                textView2.setText(String.valueOf(ans));
                Toast.makeText(MainActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
                s="";
                no=0;opcount=0;
                ans=0;
                textView1.setText(s);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                number(0);
                else
                    decimal(0);
                s=s+"0";noval=0;
                textView1.setText(s);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(1);
                else
                    decimal(1);
                s=s+"1";noval=0;
                textView1.setText(s);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(2);
                else
                    decimal(2);
                s=s+"2";noval=0;
                textView1.setText(s);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(3);
                else
                    decimal(3);
                s=s+"3";noval=0;
                textView1.setText(s);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(4);
                else
                    decimal(4);
                s=s+"4";noval=0;
                textView1.setText(s);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(5);
                else
                    decimal(5);
                s=s+"5";noval=0;
                textView1.setText(s);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(6);
                else
                    decimal(6);
                s=s+"6";noval=0;
                textView1.setText(s);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(7);
                else
                    decimal(7);
                s=s+"7";noval=0;
                textView1.setText(s);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(8);
                else
                    decimal(8);
                s=s+"8";noval=0;
                textView1.setText(s);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decpoint==0)
                    number(9);
                else
                    decimal(9);
                s=s+"9";noval=0;
                textView1.setText(s);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noval==1)
                {  n1=ans;
                no=0;np=0;
                div=10;decpoint=0;
                s=s+String.valueOf(n1)+"+";
                textView1.setText(s);
                op='+';opcount++;}
                else
                {
                n1=no+np;
                no=0;np=0;
                    noval=0;
                div=10;decpoint=0;
                s=s+"+";
                textView1.setText(s);
                op='+';opcount++;}
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noval==1)
                {  n1=ans;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+String.valueOf(n1)+"-";
                    textView1.setText(s);
                    op='-';opcount++;}
                else
                {
                    n1=no+np;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+"-";
                    noval=0;
                    textView1.setText(s);
                    op='-';opcount++;}
            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noval==1)
                {  n1=ans;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+String.valueOf(n1)+"*";
                    textView1.setText(s);
                    op='*';opcount++;}
                else
                {
                    n1=no+np;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+"*";
                    noval=0;
                    textView1.setText(s);
                    op='*';opcount++;}
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noval==1)
                {  n1=ans;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+String.valueOf(n1)+"/";
                    textView1.setText(s);
                    op='/';opcount++;}
                else
                {
                    n1=no+np;
                    no=0;np=0;
                    div=10;decpoint=0;
                    s=s+"/";
                    noval=0;
                    textView1.setText(s);
                    op='/';opcount++;}
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=no+np;
                if(opcount>1)
                    postfix(s);
                else
                switch(op)
                {
                    case '+':ans=n1+n2;break;
                    case '-':ans=n1-n2;break;
                    case '*':ans=n1*n2;break;
                    case '/':ans=n1/n2;break;
                    default:ans=no+np;break;
                }
                textView2.setText(s);
                textView1.setText(String.valueOf(ans));
                s="";n1=0;n2=0;noval=1; no=0;np=0;
                div=10;decpoint=0;op='\0';opcount=0;
            }
        });
    }






    //INFIX TO POSTFIX


        void push(char ch)
        {
            top++;
            stack1[top]=ch;
        }
        char pop()
        {
            char ch;
            ch=stack1[top];
            top--;
            return ch;
        }
        int pre(char ch)
        {
            switch(ch)
            {
                case '-':return 1;
                case '+':return 1;
                case '*':return 2;
                case '/':return 2;
            }
            return 0;
        }
        boolean operator(char ch)
        {
            if(ch=='/'||ch=='*'||ch=='+'||ch=='-')
                return true;
            else
                return false;
        }
        boolean isAlpha(char ch)
        {
            if(ch>='a'&&ch<='z'||ch>='0'&&ch=='9')
                return true;
            else
                return false;
        }
        void postfix(String str)
        {
            char output[]=new char[str.length()];
            char ch;
            int p=0,i;
            for(i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                if(ch=='(')
                {
                    push(ch);
                }
                else if(isAlpha(ch))
                {
                    output[p++]=ch;
                }
                else if(operator(ch))
                {
                    if(stack1[top]==0||(pre(ch)>pre(stack1[top]))||stack1[top]=='(')
                    {
                        push(ch);
                    }
                }
                else if(pre(ch)<=pre(stack1[top]))
                {
                    output[p++]=pop();
                    push(ch);
                }
                else if(ch==')')
                {
                    while((ch=pop())!='(')
                    {
                        output[p++]=ch;
                    }
                }
            }
            while(top!=0)
            {
                output[p++]=pop();
            }
            textView2.setText(String.valueOf(output));
            s=String.valueOf(output);
        }



}
