import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;
public class shapes_DOM {
static int numberOfCircles = 0;
static int x[] = new int[10];
static int y[] = new int[10];
static int r[] = new int[10];
static String color[] = new String[10];
public static void main(String [ ] args ) {
try{
// create a DOMParser
DOMParser parser=new DOMParser();
parser.parse(args[0]);
Document doc=parser.getDocument();
} catch (Exception e){
e.printStackTrace(System.err);
}

}
// get all the circle nodes
NodeList nodelist = doc.getElementsByTagName("circle");
numberOfCircles = nodelist.getLength();
// iterate over circle nodes
for(int i=0; i<nodelist.getLength(); i++) {
Node node = nodelist.item(i);
}
// get color attribute
NamedNodeMap attrs = node.getAttributes();
if(attrs.getLength()!=0)
color[i]=(String)attrs.getNamedItem("color").getNodeValue();

// get child nodes ...Example (DOMParser DOMParser)
// get the child nodes of a circle
NodeList childnodelist = node.getChildNodes();
// get x, y, and radius
for(int j=0; j<childnodelist.getLength(); j++)
{
Node cNode = childnodelist.item(j);
Node tNode = childnode.getFirstChild();
String childnodename=cNode.getNodeName();
if(childnodename.equals("x"))
    x[i]=Integer.parseInt(tNode.getNodeValue());
else if(childnodename.equals("y"))
    y[i]=Integer.parseInt(tNode.getNodeValue());
else if(childnodename.equals("radius"))
    r[i]=Integer.parseInt(tNode.getNodeValue());
}