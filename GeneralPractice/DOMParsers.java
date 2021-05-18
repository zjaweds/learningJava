import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;

public class DOMParsers{
    static int numberOfArticles = 0;
    static String titles[] = new String[10];
    static String dates[] = new String[10];
    static String authors[]= new String[10];
    static String abstracts[] = new String[10];
    static String contents[] = new String[10];
    public static void main(String a[]){
        try{
            DOMParser parser = new DOMParser();
            parser.parse(a[0]);
            Document doc = parser.getDocument();
        }
        catch(Exception e){
            e.printStackTrace(System.err);
        }
        NodeList nodelist= doc.getElementByTagName("article");
        numberOfArticles = nodelist.getLength();
        for(int i=0; i<numberOfArticles;i++){
            Node titleNode = nodelist.item(i);
            NamedNodeMap atrbs = node.getAttributes();
            if(atrbs.getLength()!=0){
                titles[i] = (String) atrbs.getNamedItem("title").getNodeValue();
                dates[i] = (String) atrbs.getNamedItem("date").getNodeValue();
                authors[i] = (String) atrbs.getNamedItem("author").getNodeValue();
                abstracts[i] = (String) atrbs.getNamedItem("abstract").getNodeValue();
                contents[i] = (String) atrbs.getNamedItem("content").getNodeValue();
            }
            // NodeList childNodeList = node.getChildNodes();
            // for(int j= 0; j<childNodeList.getLength();j++){
            //     Node cNode = childNodeList.item(j);
            //     Node tNode = childNodeList.getFirstChild();
            //     Stri
            // }
        }
    }
}


<articles>
<article>
	<title> Introduction to XML </title>
	<date> March 4, 2011 </date>
	<author> Khalid Raza </author>
	<abstract> XML is powerful </abstract>
	<content> XML is easily learned. XML is not for displaying information but for managing information (Structuring Data).
	</content>
</article>
<articles>