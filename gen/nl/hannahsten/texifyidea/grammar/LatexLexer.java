/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package nl.hannahsten.texifyidea.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import nl.hannahsten.texifyidea.util.Magic;

import java.util.ArrayDeque;
import java.util.Deque;

import static nl.hannahsten.texifyidea.psi.LatexTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>LatexLexer.flex</tt>
 */
public class LatexLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INLINE_MATH = 2;
  public static final int INLINE_MATH_LATEX = 4;
  public static final int DISPLAY_MATH = 6;
  public static final int TEXT_INSIDE_INLINE_MATH = 8;
  public static final int NESTED_INLINE_MATH = 10;
  public static final int PREAMBLE_OPTION = 12;
  public static final int NEW_ENVIRONMENT_DEFINITION_NAME = 14;
  public static final int NEW_ENVIRONMENT_DEFINITION = 16;
  public static final int NEW_ENVIRONMENT_SKIP_BRACE = 18;
  public static final int NEW_ENVIRONMENT_DEFINITION_END = 20;
  public static final int INLINE_VERBATIM_START = 22;
  public static final int INLINE_VERBATIM_PIPE = 24;
  public static final int INLINE_VERBATIM_EXCL_MARK = 26;
  public static final int INLINE_VERBATIM_QUOTES = 28;
  public static final int INLINE_VERBATIM_EQUALS = 30;
  public static final int POSSIBLE_VERBATIM_BEGIN = 32;
  public static final int VERBATIM_OPTIONAL_ARG = 34;
  public static final int VERBATIM_START = 36;
  public static final int VERBATIM_END = 38;
  public static final int VERBATIM = 40;
  public static final int POSSIBLE_VERBATIM_OPTIONAL_ARG = 42;
  public static final int POSSIBLE_VERBATIM_END = 44;
  public static final int OFF = 46;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int[] ZZ_LEXSTATE = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char[] ZZ_CMAP_Z = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char[] ZZ_CMAP_Y = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char[] ZZ_CMAP_A = zzUnpackCMap(
    "\11\0\1\10\1\20\2\22\1\21\22\0\1\10\1\35\1\52\1\0\1\55\1\34\1\45\1\0\1\2\1"+
    "\3\1\47\21\0\1\56\1\42\1\56\1\0\1\24\23\17\1\36\3\17\1\37\2\17\1\4\1\1\1\5"+
    "\3\0\1\32\1\11\1\30\1\16\1\12\1\25\1\13\1\31\1\14\2\17\1\50\1\54\1\15\1\43"+
    "\1\40\1\17\1\33\1\41\1\27\1\17\1\46\1\53\1\26\2\17\1\6\1\51\1\7\7\0\1\23\32"+
    "\0\1\44\337\0\1\44\177\0\13\44\35\0\2\23\5\0\1\44\57\0\1\44\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\30\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\11\1\2\1\12\1\13\1\2\1\14\1\15"+
    "\1\16\1\2\1\17\1\20\1\21\3\2\1\22\1\23"+
    "\1\1\1\24\1\2\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\22\1\36\1\37\1\40"+
    "\1\41\1\35\1\42\1\43\1\44\1\45\1\46\1\7"+
    "\1\35\2\1\1\47\1\50\1\51\4\47\1\11\5\47"+
    "\1\0\2\12\1\0\2\12\1\47\1\21\1\52\1\53"+
    "\1\54\2\36\4\0\1\55\7\47\1\0\2\12\1\55"+
    "\1\47\4\0\1\47\1\56\4\47\2\0\2\12\1\47"+
    "\1\0\1\57\2\0\3\47\1\60\1\47\2\0\2\12"+
    "\1\61\3\0\1\62\2\47\1\60\1\47\2\0\1\12"+
    "\1\63\1\0\3\47\1\0\1\12\1\0\3\47\1\0"+
    "\1\12\1\0\3\47\1\0\1\12\1\0\2\47\1\60"+
    "\1\0\1\12\1\0\2\47\1\0\1\12\1\64\2\47"+
    "\1\0\1\65\1\47\1\66\1\47\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439"+
    "\0\u0468\0\u0497\0\u04c6\0\u04c6\0\u04c6\0\u04c6\0\u04c6\0\u04c6"+
    "\0\u04f5\0\u0524\0\u0553\0\u0582\0\u04c6\0\u04c6\0\u04c6\0\u0468"+
    "\0\u04c6\0\u05b1\0\u04c6\0\u04c6\0\u04c6\0\u05e0\0\u060f\0\u063e"+
    "\0\u04c6\0\u04c6\0\u04c6\0\u04c6\0\u066d\0\u04c6\0\u04c6\0\u04c6"+
    "\0\u04c6\0\u04c6\0\u04c6\0\u04c6\0\u04c6\0\u0553\0\u0553\0\u069c"+
    "\0\u04c6\0\u04c6\0\u04c6\0\u06cb\0\u0553\0\u0553\0\u06fa\0\u0729"+
    "\0\u0553\0\u0553\0\u0758\0\u0787\0\u07b6\0\u0553\0\u0553\0\u0553"+
    "\0\u07e5\0\u0814\0\u0843\0\u0872\0\u0553\0\u08a1\0\u08d0\0\u08ff"+
    "\0\u092e\0\u095d\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48"+
    "\0\u0a77\0\u0553\0\u0553\0\u0553\0\u0553\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0758\0\u0b62\0\u0553\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u098c\0\u0d67"+
    "\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0843\0\u0e81\0\u0eb0"+
    "\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"+
    "\0\u0553\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171"+
    "\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u0843\0\u125c\0\u128b\0\u12ba"+
    "\0\u0843\0\u12e9\0\u1318\0\u0553\0\u1347\0\u1376\0\u13a5\0\u13d4"+
    "\0\u0553\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d"+
    "\0\u154c\0\u157b\0\u15aa\0\u15d9\0\u1608\0\u1637\0\u1666\0\u1695"+
    "\0\u16c4\0\u16f3\0\u1722\0\u1751\0\u1780\0\u17af\0\u0843\0\u17de"+
    "\0\u180d\0\u183c\0\u186b\0\u189a\0\u18c9\0\u18f8\0\u1927\0\u1956"+
    "\0\u1985\0\u19b4\0\u19e3\0\u1a12\0\u0553\0\u1a41\0\u0843";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\7\31\3\42\1\43\10\31\1\44\1\45\4\31"+
    "\1\45\1\31\1\46\1\47\1\31\1\50\1\31\2\45"+
    "\2\31\1\51\2\31\1\52\1\33\1\34\1\53\1\54"+
    "\1\37\1\40\1\41\7\31\3\42\1\43\10\31\1\44"+
    "\1\45\4\31\1\45\1\31\1\46\1\47\1\31\1\50"+
    "\1\31\2\45\2\31\1\55\2\31\1\56\1\33\1\34"+
    "\1\53\1\54\1\37\1\40\1\41\7\31\3\42\1\43"+
    "\10\31\1\44\1\45\4\31\1\45\1\31\1\46\1\47"+
    "\1\31\1\50\1\31\2\45\2\31\1\46\2\31\1\57"+
    "\1\33\1\34\1\53\1\54\1\37\1\40\1\41\7\31"+
    "\3\42\1\43\10\31\1\44\1\45\4\31\1\45\1\31"+
    "\1\46\1\47\1\31\1\50\1\31\2\45\2\31\1\51"+
    "\2\31\1\60\1\33\1\34\1\35\1\36\1\37\1\61"+
    "\1\41\7\31\3\42\1\43\10\31\1\44\1\45\4\31"+
    "\1\45\1\31\1\46\1\47\1\31\1\50\1\31\2\45"+
    "\2\31\1\62\2\31\1\60\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\7\31\3\42\1\43\10\31\1\44"+
    "\1\45\4\31\1\45\1\31\1\46\1\47\1\31\1\50"+
    "\1\31\2\45\2\31\1\55\2\31\1\60\1\33\1\34"+
    "\1\35\1\36\1\37\1\61\1\41\7\31\3\42\1\43"+
    "\10\31\1\44\1\45\4\31\1\45\1\31\1\46\1\47"+
    "\1\31\1\50\1\31\2\45\2\31\1\63\2\31\1\60"+
    "\1\33\1\34\1\35\1\36\1\37\1\64\1\41\7\31"+
    "\3\42\1\43\10\31\1\44\1\45\4\31\1\45\1\31"+
    "\1\46\1\47\1\31\1\50\1\31\2\45\2\31\1\46"+
    "\2\31\1\65\1\33\1\34\1\35\1\36\1\66\1\67"+
    "\1\41\7\31\3\42\1\43\10\31\1\44\1\45\4\31"+
    "\1\45\1\31\1\46\1\47\1\31\1\50\1\31\2\45"+
    "\2\31\1\63\2\31\1\60\1\33\1\34\1\35\1\36"+
    "\1\70\1\40\1\41\7\31\3\42\1\43\10\31\1\44"+
    "\1\45\4\31\1\45\1\31\1\46\1\47\1\31\1\50"+
    "\1\31\2\45\2\31\1\46\2\31\1\65\1\33\1\34"+
    "\1\35\1\36\1\66\1\71\1\41\7\31\3\42\1\43"+
    "\10\31\1\44\1\45\4\31\1\45\1\31\1\46\1\47"+
    "\1\31\1\50\1\31\2\45\2\31\1\63\2\31\1\60"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\7\31"+
    "\3\42\1\43\10\31\1\44\1\72\4\31\1\73\1\31"+
    "\1\46\1\47\1\31\1\50\1\31\1\74\1\75\2\31"+
    "\1\46\1\31\51\76\1\77\42\76\1\77\73\76\1\77"+
    "\46\76\1\77\14\76\1\100\1\60\1\33\1\34\1\35"+
    "\1\36\1\37\1\61\1\41\7\100\3\42\1\43\10\100"+
    "\1\44\1\45\4\100\1\45\1\100\1\46\1\47\3\100"+
    "\2\45\2\100\1\46\1\100\1\31\1\60\1\33\1\34"+
    "\1\101\1\102\1\37\1\40\1\41\7\31\3\42\1\43"+
    "\10\31\1\44\1\45\4\31\1\45\1\31\1\46\1\47"+
    "\1\31\1\50\1\31\2\45\2\31\1\46\2\31\1\60"+
    "\1\33\1\34\1\35\1\36\1\37\1\103\1\41\7\31"+
    "\3\42\1\43\10\31\1\44\1\45\4\31\1\45\1\31"+
    "\1\46\1\47\1\31\1\50\1\31\2\45\2\31\1\46"+
    "\2\31\1\60\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\7\31\3\42\1\43\10\31\1\44\1\45\4\31"+
    "\1\45\1\31\1\46\1\47\1\31\1\50\1\31\2\45"+
    "\2\31\1\46\1\31\1\76\1\104\6\76\1\42\7\76"+
    "\3\42\34\76\4\105\1\106\3\105\1\107\7\105\3\107"+
    "\34\105\1\110\5\111\1\112\2\111\7\110\4\111\10\110"+
    "\2\111\4\110\1\111\1\110\2\111\3\110\2\111\2\110"+
    "\1\111\1\110\34\76\1\113\22\76\1\114\10\0\7\114"+
    "\4\0\10\114\2\0\4\114\1\0\1\114\2\0\3\114"+
    "\2\0\2\114\1\0\1\115\2\116\1\117\1\116\1\120"+
    "\4\116\1\121\1\122\2\123\1\124\2\123\1\125\1\116"+
    "\2\0\1\126\6\123\1\127\2\116\4\123\1\116\1\123"+
    "\2\116\1\130\1\116\1\131\2\116\2\123\1\116\1\132"+
    "\56\0\1\133\10\0\1\42\7\0\3\42\33\0\1\133"+
    "\10\0\1\42\7\0\3\42\113\0\10\134\1\135\7\134"+
    "\2\136\1\135\12\134\1\137\20\134\1\140\4\116\1\120"+
    "\4\116\1\121\1\122\2\123\1\124\2\123\1\125\1\116"+
    "\2\0\1\126\2\123\1\141\3\123\1\127\2\116\4\123"+
    "\1\116\1\123\2\116\1\130\1\116\1\131\2\116\2\123"+
    "\1\116\1\132\3\116\1\142\1\120\4\116\1\121\1\122"+
    "\2\123\1\124\2\123\1\125\1\116\2\0\1\126\6\123"+
    "\1\127\2\116\4\123\1\116\1\123\2\116\1\130\1\116"+
    "\1\131\2\116\2\123\1\116\1\132\2\116\1\117\1\116"+
    "\1\120\1\143\3\116\1\121\1\122\2\123\1\124\2\123"+
    "\1\125\1\116\2\0\1\126\6\123\1\127\2\116\4\123"+
    "\1\116\1\123\2\116\1\130\1\116\1\131\2\116\2\123"+
    "\1\116\1\132\4\116\1\120\4\116\1\121\1\122\2\123"+
    "\1\124\2\123\1\125\1\116\2\0\1\126\6\123\1\127"+
    "\2\116\4\123\1\116\1\123\2\116\1\130\1\116\1\131"+
    "\2\116\2\123\1\116\1\132\4\116\1\144\1\145\3\116"+
    "\1\121\1\122\2\123\1\124\2\123\1\125\1\116\2\0"+
    "\1\126\6\123\1\127\2\116\4\123\1\116\1\123\2\116"+
    "\1\130\1\116\1\131\2\116\2\123\1\116\1\132\1\146"+
    "\10\0\7\146\4\0\10\146\2\0\4\146\1\0\1\146"+
    "\2\0\3\146\2\0\2\146\1\0\1\147\11\0\1\150"+
    "\1\151\54\0\1\107\7\0\3\107\34\0\1\110\10\0"+
    "\7\110\4\0\10\110\2\0\4\110\1\0\1\110\2\0"+
    "\3\110\2\0\2\110\1\0\1\110\10\0\1\152\7\0"+
    "\3\152\12\0\1\153\21\0\1\114\10\0\7\114\4\0"+
    "\10\114\2\0\4\114\1\0\1\114\2\0\3\114\2\0"+
    "\2\114\1\0\2\114\5\0\1\154\2\0\7\114\4\0"+
    "\10\114\2\0\4\114\1\0\1\114\2\0\3\114\2\0"+
    "\2\114\1\0\1\114\11\0\1\123\1\155\5\123\4\0"+
    "\10\123\2\0\4\123\1\0\1\123\2\0\1\123\1\0"+
    "\1\123\2\0\2\123\13\0\4\123\1\156\2\123\4\0"+
    "\10\123\2\0\4\123\1\0\1\123\2\0\1\123\1\0"+
    "\1\123\2\0\2\123\13\0\7\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\1\123\1\157\5\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\3\123\1\160\3\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\1\123\1\161\5\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\1\123\1\162\5\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\7\123\4\0\10\123\2\0\3\123\1\163"+
    "\1\0\1\123\2\0\1\123\1\0\1\123\2\0\2\123"+
    "\10\0\1\154\50\0\20\134\2\0\45\134\1\135\7\134"+
    "\2\136\1\135\12\134\1\137\21\134\10\0\1\136\7\0"+
    "\3\136\12\0\1\164\21\0\10\134\1\137\7\134\2\164"+
    "\1\137\13\134\1\165\1\134\1\166\24\134\1\167\11\134"+
    "\2\0\35\134\11\0\1\123\1\170\5\123\4\0\10\123"+
    "\2\0\4\123\1\0\1\123\2\0\1\123\1\0\1\123"+
    "\2\0\2\123\2\0\1\146\10\0\7\146\4\0\10\146"+
    "\2\0\4\146\1\0\1\146\2\0\3\146\2\0\2\146"+
    "\1\0\2\146\5\0\1\154\2\0\7\146\4\0\10\146"+
    "\2\0\4\146\1\0\1\146\2\0\3\146\2\0\2\146"+
    "\1\0\1\146\12\0\1\171\61\0\1\172\51\0\1\153"+
    "\7\0\3\153\13\0\1\173\1\0\1\174\27\0\2\123"+
    "\1\175\4\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\5\123"+
    "\1\176\1\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\7\123"+
    "\4\0\10\123\2\0\4\123\1\0\1\123\2\0\1\123"+
    "\1\0\1\123\2\0\1\177\1\123\13\0\7\123\4\0"+
    "\1\123\1\200\6\123\2\0\4\123\1\0\1\123\2\0"+
    "\1\123\1\0\1\123\2\0\2\123\13\0\4\123\1\124"+
    "\2\123\4\0\10\123\2\0\4\123\1\0\1\123\2\0"+
    "\1\123\1\0\1\123\2\0\2\123\13\0\7\123\4\0"+
    "\7\123\1\201\2\0\4\123\1\0\1\123\2\0\1\123"+
    "\1\0\1\123\2\0\2\123\13\0\7\123\4\0\3\123"+
    "\1\202\4\123\2\0\4\123\1\0\1\123\2\0\1\123"+
    "\1\0\1\123\2\0\2\123\12\0\1\164\7\0\3\164"+
    "\13\0\1\203\1\0\1\204\16\0\12\134\1\205\5\134"+
    "\2\0\55\134\2\0\10\134\1\206\24\134\11\0\7\123"+
    "\4\0\2\123\1\207\5\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\15\0\1\210"+
    "\61\0\1\211\52\0\1\212\76\0\1\213\35\0\3\123"+
    "\1\214\3\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\1\123"+
    "\1\215\5\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\4\123"+
    "\1\216\2\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\1\217"+
    "\6\123\4\0\10\123\2\0\4\123\1\0\1\123\2\0"+
    "\1\123\1\0\1\123\2\0\2\123\13\0\3\123\1\220"+
    "\3\123\4\0\10\123\2\0\4\123\1\0\1\123\2\0"+
    "\1\123\1\0\1\123\2\0\2\123\14\0\1\221\76\0"+
    "\1\222\24\0\20\134\2\0\15\134\1\223\37\134\2\0"+
    "\11\134\1\224\23\134\11\0\7\123\4\0\3\123\1\225"+
    "\4\123\2\0\4\123\1\0\1\123\2\0\1\123\1\0"+
    "\1\123\2\0\2\123\16\0\1\226\101\0\1\227\52\0"+
    "\1\230\34\0\4\123\1\231\2\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\4\123\1\232\2\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\1\123\1\233\5\123\4\0\10\123\2\0"+
    "\4\123\1\0\1\123\2\0\1\123\1\0\1\123\2\0"+
    "\2\123\13\0\7\123\4\0\10\123\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\234\1\123\2\0\2\123\13\0"+
    "\4\123\1\235\2\123\4\0\10\123\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\2\123\41\0"+
    "\1\236\52\0\1\237\23\0\10\134\1\223\7\134\2\236"+
    "\1\223\15\134\1\166\36\134\2\0\17\134\1\240\15\134"+
    "\15\0\1\241\51\0\1\227\7\0\3\227\15\0\1\174"+
    "\57\0\1\242\26\0\7\123\4\0\10\123\2\0\4\123"+
    "\1\0\1\123\2\0\1\243\1\0\1\123\2\0\2\123"+
    "\13\0\7\123\4\0\2\123\1\244\5\123\2\0\4\123"+
    "\1\0\1\123\2\0\1\123\1\0\1\123\2\0\2\123"+
    "\13\0\7\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\245\2\0\2\123\12\0\1\236"+
    "\7\0\3\236\15\0\1\204\57\0\1\246\15\0\12\134"+
    "\1\247\5\134\2\0\35\134\12\0\1\250\55\0\3\123"+
    "\1\251\3\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\7\123"+
    "\4\0\3\123\1\252\4\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\3\123"+
    "\1\253\3\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\14\0\1\254"+
    "\44\0\20\134\2\0\11\134\1\255\23\134\33\0\1\256"+
    "\34\0\7\123\4\0\7\123\1\257\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\2\123\13\0"+
    "\7\123\4\0\4\123\1\260\3\123\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\2\123\13\0"+
    "\4\123\1\261\2\123\4\0\10\123\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\2\123\35\0"+
    "\1\262\23\0\10\134\1\255\7\134\2\262\1\255\17\134"+
    "\1\263\14\134\10\0\1\256\7\0\3\256\17\0\1\264"+
    "\25\0\7\123\4\0\10\123\2\0\4\123\1\0\1\265"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\7\123"+
    "\4\0\5\123\1\266\2\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\13\0\1\123"+
    "\1\267\5\123\4\0\10\123\2\0\4\123\1\0\1\123"+
    "\2\0\1\123\1\0\1\123\2\0\2\123\12\0\1\262"+
    "\7\0\3\262\17\0\1\270\14\0\10\134\1\263\7\134"+
    "\2\270\1\263\20\134\1\271\13\134\10\0\1\264\7\0"+
    "\3\264\20\0\1\272\24\0\4\123\1\273\2\123\4\0"+
    "\10\123\2\0\4\123\1\0\1\123\2\0\1\123\1\0"+
    "\1\123\2\0\2\123\13\0\7\123\4\0\6\123\1\274"+
    "\1\123\2\0\4\123\1\0\1\123\2\0\1\123\1\0"+
    "\1\123\2\0\2\123\12\0\1\270\7\0\3\270\20\0"+
    "\1\275\13\0\20\134\2\0\3\134\1\276\31\134\15\0"+
    "\1\277\52\0\7\123\4\0\10\123\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\1\123\1\300"+
    "\13\0\7\123\4\0\7\123\1\301\2\0\4\123\1\0"+
    "\1\123\2\0\1\123\1\0\1\123\2\0\2\123\27\0"+
    "\1\302\31\0\20\134\2\0\3\134\1\303\31\134\20\277"+
    "\2\0\35\277\11\0\1\123\1\304\5\123\4\0\10\123"+
    "\2\0\4\123\1\0\1\123\2\0\1\123\1\0\1\123"+
    "\2\0\2\123\2\0\11\305\7\123\4\0\10\123\2\305"+
    "\4\123\1\305\1\123\2\305\1\123\1\305\1\123\2\305"+
    "\2\123\2\305\25\0\1\303\31\0\20\303\2\0\35\303"+
    "\11\0\4\123\1\306\2\123\4\0\10\123\2\0\4\123"+
    "\1\0\1\123\2\0\1\123\1\0\1\123\2\0\2\123"+
    "\13\0\7\123\4\0\3\123\1\307\4\123\2\0\4\123"+
    "\1\0\1\123\2\0\1\123\1\0\1\123\2\0\2\123"+
    "\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6768];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\30\0\12\1\1\11\32\1\2\11\5\1\2\11\2\1"+
    "\2\11\3\1\3\11\4\1\1\11\5\1\1\0\2\1"+
    "\1\0\3\1\4\11\2\1\4\0\1\11\7\1\1\0"+
    "\4\1\4\0\6\1\2\0\3\1\1\0\1\11\2\0"+
    "\5\1\2\0\3\1\3\0\3\1\1\11\1\1\2\0"+
    "\1\1\1\11\1\0\3\1\1\0\1\1\1\0\3\1"+
    "\1\0\1\1\1\0\3\1\1\0\1\1\1\0\3\1"+
    "\1\0\1\1\1\0\2\1\1\0\4\1\1\0\2\1"+
    "\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Deque<Integer> stack = new ArrayDeque<>();


  public void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  public void yypopState() {
    yybegin(stack.pop());
  }


  public LatexLexer() {
    this(null);
  }

  /**
   * In order to avoid a parsing error for new environment definitions, this keeps track of the number of braces in the \newenvironment
   * parameters, so as to know when the parameters are exited.
   */
  private int newEnvironmentBracesNesting = 0;

  /**
   * Also keep track of brackets of verbatim environment optional arguments.
   */
  private int verbatimOptionalArgumentBracketsCount = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LatexLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return NORMAL_TEXT_WORD;
            } 
            // fall through
          case 56: break;
          case 2: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 57: break;
          case 3: 
            { return OPEN_PAREN;
            } 
            // fall through
          case 58: break;
          case 4: 
            { return CLOSE_PAREN;
            } 
            // fall through
          case 59: break;
          case 5: 
            { return OPEN_BRACKET;
            } 
            // fall through
          case 60: break;
          case 6: 
            { return CLOSE_BRACKET;
            } 
            // fall through
          case 61: break;
          case 7: 
            { return OPEN_BRACE;
            } 
            // fall through
          case 62: break;
          case 8: 
            { return CLOSE_BRACE;
            } 
            // fall through
          case 63: break;
          case 9: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 64: break;
          case 10: 
            { return COMMENT_TOKEN;
            } 
            // fall through
          case 65: break;
          case 11: 
            { return NORMAL_TEXT_CHAR;
            } 
            // fall through
          case 66: break;
          case 12: 
            { return AMPERSAND;
            } 
            // fall through
          case 67: break;
          case 13: 
            { return STAR;
            } 
            // fall through
          case 68: break;
          case 14: 
            { yypushState(INLINE_MATH); return INLINE_MATH_START;
            } 
            // fall through
          case 69: break;
          case 15: 
            { return M_OPEN_BRACKET;
            } 
            // fall through
          case 70: break;
          case 16: 
            { return M_CLOSE_BRACKET;
            } 
            // fall through
          case 71: break;
          case 17: 
            { yypopState(); return INLINE_MATH_END;
            } 
            // fall through
          case 72: break;
          case 18: 
            { yypopState(); return CLOSE_BRACE;
            } 
            // fall through
          case 73: break;
          case 19: 
            { yypushState(NESTED_INLINE_MATH); return INLINE_MATH_START;
            } 
            // fall through
          case 74: break;
          case 20: 
            { yypopState(); yypushState(NEW_ENVIRONMENT_DEFINITION); return CLOSE_BRACE;
            } 
            // fall through
          case 75: break;
          case 21: 
            { newEnvironmentBracesNesting++; return OPEN_BRACE;
            } 
            // fall through
          case 76: break;
          case 22: 
            { newEnvironmentBracesNesting--;
        if(newEnvironmentBracesNesting == 0) {
            yypopState(); yypushState(NEW_ENVIRONMENT_SKIP_BRACE);
            // We could have return normal text, but in this way the braces still match
            return OPEN_BRACE;
        } else {
            return CLOSE_BRACE;
        }
            } 
            // fall through
          case 77: break;
          case 23: 
            { yypopState(); newEnvironmentBracesNesting = 1; yypushState(NEW_ENVIRONMENT_DEFINITION_END); return CLOSE_BRACE;
            } 
            // fall through
          case 78: break;
          case 24: 
            { newEnvironmentBracesNesting--;
        if(newEnvironmentBracesNesting == 0) {
            yypopState();
        }
        return CLOSE_BRACE;
            } 
            // fall through
          case 79: break;
          case 25: 
            { yypopState(); yypushState(INLINE_VERBATIM_EXCL_MARK); return OPEN_BRACE;
            } 
            // fall through
          case 80: break;
          case 26: 
            { yypopState(); yypushState(INLINE_VERBATIM_EQUALS); return OPEN_BRACE;
            } 
            // fall through
          case 81: break;
          case 27: 
            { yypopState(); yypushState(INLINE_VERBATIM_PIPE); return OPEN_BRACE;
            } 
            // fall through
          case 82: break;
          case 28: 
            { yypopState(); yypushState(INLINE_VERBATIM_QUOTES); return OPEN_BRACE;
            } 
            // fall through
          case 83: break;
          case 29: 
            { return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 84: break;
          case 30: 
            { yypopState();
        // toString to fix comparisons of charsequence subsequences with string
        if (Magic.Environment.verbatim.contains(yytext().toString())) {
            yypushState(VERBATIM_START);
        }
        return NORMAL_TEXT_WORD;
            } 
            // fall through
          case 85: break;
          case 31: 
            { verbatimOptionalArgumentBracketsCount++; return OPEN_BRACKET;
            } 
            // fall through
          case 86: break;
          case 32: 
            { verbatimOptionalArgumentBracketsCount--;
        if (verbatimOptionalArgumentBracketsCount == 0) yypopState(); yypushState(VERBATIM);
        return CLOSE_BRACKET;
            } 
            // fall through
          case 87: break;
          case 33: 
            { yypopState(); yypushState(POSSIBLE_VERBATIM_OPTIONAL_ARG); return CLOSE_BRACE;
            } 
            // fall through
          case 88: break;
          case 34: 
            { yypopState(); yypushState(VERBATIM); return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 89: break;
          case 35: 
            { verbatimOptionalArgumentBracketsCount++; yypopState(); yypushState(VERBATIM_OPTIONAL_ARG); return OPEN_BRACKET;
            } 
            // fall through
          case 90: break;
          case 36: 
            { yypopState(); yypushState(VERBATIM); return com.intellij.psi.TokenType.WHITE_SPACE;
            } 
            // fall through
          case 91: break;
          case 37: 
            { // Pop current state
        yypopState();
        if (Magic.Environment.verbatim.contains(yytext().toString())) {
            // Pop verbatim state
            yypopState();
            return NORMAL_TEXT_WORD;
        }
        return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 92: break;
          case 38: 
            { yypopState(); return RAW_TEXT_TOKEN;
            } 
            // fall through
          case 93: break;
          case 39: 
            { return COMMAND_TOKEN;
            } 
            // fall through
          case 94: break;
          case 40: 
            { yypushState(INLINE_MATH_LATEX); return INLINE_MATH_START;
            } 
            // fall through
          case 95: break;
          case 41: 
            { yypushState(DISPLAY_MATH); return DISPLAY_MATH_START;
            } 
            // fall through
          case 96: break;
          case 42: 
            { yypopState(); return DISPLAY_MATH_END;
            } 
            // fall through
          case 97: break;
          case 43: 
            { return DISPLAY_MATH_START;
            } 
            // fall through
          case 98: break;
          case 44: 
            { return DISPLAY_MATH_END;
            } 
            // fall through
          case 99: break;
          case 45: 
            { yypushState(PREAMBLE_OPTION); return OPEN_BRACE;
            } 
            // fall through
          case 100: break;
          case 46: 
            { return END_TOKEN;
            } 
            // fall through
          case 101: break;
          case 47: 
            { yypushState(POSSIBLE_VERBATIM_END); return END_TOKEN;
            } 
            // fall through
          case 102: break;
          case 48: 
            { yypushState(INLINE_VERBATIM_START); return COMMAND_TOKEN;
            } 
            // fall through
          case 103: break;
          case 49: 
            { yypushState(TEXT_INSIDE_INLINE_MATH); return COMMAND_TOKEN;
            } 
            // fall through
          case 104: break;
          case 50: 
            { yypushState(POSSIBLE_VERBATIM_BEGIN); return BEGIN_TOKEN;
            } 
            // fall through
          case 105: break;
          case 51: 
            { return BEGIN_TOKEN;
            } 
            // fall through
          case 106: break;
          case 52: 
            { yypopState(); return COMMENT_TOKEN;
            } 
            // fall through
          case 107: break;
          case 53: 
            { yypushState(OFF); return COMMENT_TOKEN;
            } 
            // fall through
          case 108: break;
          case 54: 
            { return COMMAND_IFNEXTCHAR;
            } 
            // fall through
          case 109: break;
          case 55: 
            { yypushState(NEW_ENVIRONMENT_DEFINITION_NAME); return COMMAND_TOKEN;
            } 
            // fall through
          case 110: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
