/**
 *请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 *
 * @author
 *
 */
public class offer2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringReplace=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                stringReplace.append("%20");
            }
            else{
                stringReplace.append(c);
            }
        }
        return stringReplace.toString();
    }
}
