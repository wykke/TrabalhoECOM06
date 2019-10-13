/* CompiladorSlothTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorSlothTokenManager.java */
import java.util.ArrayList;
import java.util.List;

/** Token Manager. */
public class CompiladorSlothTokenManager implements CompiladorSlothConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 33:
         return jjStopAtPos(0, 39);
      case 37:
         return jjStopAtPos(0, 26);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 40:
         return jjStopAtPos(0, 27);
      case 41:
         return jjStopAtPos(0, 28);
      case 42:
         return jjStopAtPos(0, 22);
      case 43:
         return jjStopAtPos(0, 20);
      case 45:
         return jjStopAtPos(0, 21);
      case 46:
         return jjStopAtPos(0, 29);
      case 47:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 59:
         return jjStopAtPos(0, 17);
      case 60:
         return jjStopAtPos(0, 33);
      case 61:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0xcc0000000L);
      case 62:
         return jjStopAtPos(0, 32);
      case 91:
         return jjStopAtPos(0, 18);
      case 92:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 93:
         return jjStopAtPos(0, 19);
      case 94:
         return jjStopAtPos(0, 25);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000000002000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x680000008000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4000000000200L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x10120000000000L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x14000000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 33:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 38:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 43:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 47:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 60:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 61:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 62:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000008000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x9000000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x120000000800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000002400L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000004000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000001000L);
      case 124:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 100:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(2, 49);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10100000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 114:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x600000001000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(2, 9);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(2, 51);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x4400L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(3, 14);
         return jjMoveStringLiteralDfa4_0(active0, 0x240000000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000001000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000002000L);
      case 110:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(3, 41);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000000L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(3, 11);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000008000L);
      case 116:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(3, 47);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(4, 15);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(4, 44);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(4, 52);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 110:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(4, 48);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4040000000000L);
      case 116:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(4, 46);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(5, 10);
         break;
      case 103:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(5, 12);
         break;
      case 116:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(5, 50);
         break;
      case 119:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 104:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(6, 45);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(6, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(8, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 16;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 54)
                        kind = 54;
                     { jjCheckNAddStates(0, 6); }
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xffffff7bffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 34 && kind > 53)
                     kind = 53;
                  break;
               case 3:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0xffffff7bffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if (curChar == 39 && kind > 55)
                     kind = 55;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  { jjCheckNAdd(7); }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(8, 9); }
                  break;
               case 9:
                  if (curChar == 46)
                     { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 12:
                  if (curChar == 46)
                     { jjCheckNAdd(13); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(13, 14); }
                  break;
               case 14:
                  if (curChar == 37 && kind > 57)
                     kind = 57;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(15, 14); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjAddStates(7, 8); }
                  break;
               case 4:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 16 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\151\156\164", 
"\144\157\165\142\154\145", "\143\150\141\162", "\163\164\162\151\156\147", 
"\142\157\157\154\145\141\156", "\164\162\165\145", "\146\141\154\163\145", "\134\156", "\73", "\133", "\135", 
"\53", "\55", "\52", "\57", "\57\57", "\136", "\45", "\50", "\51", "\56", "\75\75", 
"\75\41", "\76", "\74", "\75\76", "\75\74", "\75", "\46\46", "\174\174", "\41", 
"\174\53", "\167\150\145\156", "\157\164\150\145\162\167\151\163\145", "\146\157\162", 
"\167\150\151\154\145", "\146\157\162\145\141\143\150", "\146\151\162\163\164", "\154\141\163\164", 
"\142\145\147\151\156", "\145\156\144", "\151\155\160\157\162\164", "\147\145\164", 
"\167\162\151\164\145", null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   7, 8, 9, 11, 12, 15, 14, 1, 2, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000400L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public CompiladorSlothTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public CompiladorSlothTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 16; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[16];
    static private final int[] jjstateSet = new int[2 * 16];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
