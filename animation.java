import java.awt.*;
import java.applet.*;
/*
<applet code="AnimationEx.class"width="600"height="800">
</applet>
/*
public classAnimationExextendApplet
{
Imagepic;
publicvoidint()
{
pic=getImage(getDocumentBase(),"imagesjpeg");
}
public void paint(Grapics grp)
{
for(int i=50;i<100; i++)
{
grp,drawImage(pic,i,30,this);
try
{
threadsleep(200);
}
catch(Exception e){}
}
}
}