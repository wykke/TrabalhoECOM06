/* CompiladorSlothTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorSlothTokenManager.java */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Token Manager. */
public class CompiladorSlothTokenManager implements CompiladorSlothConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x58000040000L) != 0L)
         {
            jjmatchedKind = 64;
            return -1;
         }
         if ((active0 & 0xffb8000003fe00L) != 0L)
         {
            jjmatchedKind = 58;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x58000040000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 64;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0xffb8000003fe00L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
            return 4;
         }
         return -1;
      case 2:
         if ((active0 & 0x51200000000200L) != 0L)
            return 4;
         if ((active0 & 0xae98000003fc00L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x4080000014800L) != 0L)
            return 4;
         if ((active0 & 0xab90000002b400L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x8a800000020000L) != 0L)
            return 4;
         if ((active0 & 0x2110000000b400L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x1100000002000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 5;
            return 4;
         }
         if ((active0 & 0x20000000009400L) != 0L)
            return 4;
         return -1;
      case 6:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 6;
            return 4;
         }
         if ((active0 & 0x1000000002000L) != 0L)
            return 4;
         return -1;
      case 7:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 7;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 2);
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 32:
         return jjStopAtPos(0, 1);
      case 33:
         return jjStopAtPos(0, 41);
      case 37:
         return jjStopAtPos(0, 28);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 40:
         return jjStopAtPos(0, 29);
      case 41:
         return jjStopAtPos(0, 30);
      case 42:
         return jjStopAtPos(0, 24);
      case 43:
         return jjStopAtPos(0, 22);
      case 44:
         return jjStopAtPos(0, 57);
      case 45:
         return jjStopAtPos(0, 23);
      case 46:
         return jjStopAtPos(0, 31);
      case 47:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 58:
         return jjStopAtPos(0, 46);
      case 59:
         return jjStopAtPos(0, 19);
      case 60:
         return jjStopAtPos(0, 35);
      case 61:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x3300000000L);
      case 62:
         return jjStopAtPos(0, 34);
      case 91:
         return jjStopAtPos(0, 20);
      case 92:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 93:
         return jjStopAtPos(0, 21);
      case 94:
         return jjStopAtPos(0, 27);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000000002000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x3200000020000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x20000000000200L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x80880000000000L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x50000000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
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
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 38:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 43:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 47:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 60:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 62:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000020000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000000008000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x880000000800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1200000006400L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000010000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000001000L);
      case 124:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
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
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 52, 4);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80800000004000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000000L);
      case 114:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x3000000001000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 4);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 54, 4);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
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
      case 100:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 4);
         break;
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x1100000000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000001000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000002000L);
      case 110:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 4);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 4);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000020000L);
      case 116:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
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
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 4);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 4);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 55, 4);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 110:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 51, 4);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20100000008000L);
      case 116:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 49, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
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
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 4);
         break;
      case 103:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 4);
         break;
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 4);
         break;
      case 116:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 53, 4);
         break;
      case 119:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
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
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 48, 4);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000000000L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
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
         return jjMoveStringLiteralDfa8_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
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
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 44, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
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
                  if ((0xffffff73ffffffffL & l) != 0L)
                  {
                     if (kind > 64)
                        kind = 64;
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  else if (curChar == 35)
                     { jjCheckNAddTwoStates(1, 2); }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                     { jjCheckNAddStates(0, 6); }
                  }
                  break;
               case 1:
                  if ((0xfffffff7ffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 35 && kind > 56)
                     kind = 56;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 6:
                  if ((0xffffff73ffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 7:
                  if (curChar == 34 && kind > 59)
                     kind = 59;
                  break;
               case 8:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0xffffff73ffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if (curChar == 39 && kind > 61)
                     kind = 61;
                  break;
               case 11:
                  if ((0xffffff73ffffffffL & l) != 0L && kind > 64)
                     kind = 64;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  { jjCheckNAdd(13); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 15:
                  if (curChar == 46)
                     { jjCheckNAdd(16); }
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  { jjCheckNAdd(16); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(17, 18); }
                  break;
               case 18:
                  if (curChar == 46)
                     { jjCheckNAdd(19); }
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(19, 20); }
                  break;
               case 20:
                  if (curChar == 37 && kind > 63)
                     kind = 63;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(21, 20); }
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
               case 0:
                  if ((0x7fffffffffffffffL & l) != 0L)
                  {
                     if (kind > 64)
                        kind = 64;
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(4); }
                  }
                  break;
               case 1:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjAddStates(7, 8); }
                  break;
               case 3:
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(4); }
                  break;
               case 6:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjAddStates(9, 10); }
                  break;
               case 9:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 11:
                  if ((0x7fffffffffffffffL & l) != 0L && kind > 64)
                     kind = 64;
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
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\151\156\164", 
"\144\157\165\142\154\145", "\143\150\141\162", "\163\164\162\151\156\147", 
"\142\157\157\154\145\141\156", "\166\157\151\144", "\162\145\164\165\162\156", "\164\162\165\145", 
"\146\141\154\163\145", "\134\156", "\73", "\133", "\135", "\53", "\55", "\52", "\57\57", "\57", 
"\136", "\45", "\50", "\51", "\56", "\75\75", "\75\41", "\76", "\74", "\75\76", 
"\75\74", "\75", "\46\46", "\174\174", "\41", "\174\53", "\167\150\145\156", 
"\157\164\150\145\162\167\151\163\145", "\146\157\162", "\72", "\167\150\151\154\145", "\146\157\162\145\141\143\150", 
"\146\151\162\163\164", "\154\141\163\164", "\142\145\147\151\156", "\145\156\144", 
"\151\155\160\157\162\164", "\147\145\164", "\167\162\151\164\145", null, "\54", null, null, null, null, 
null, null, null, };
protected Token jjFillToken()
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
   13, 14, 15, 17, 18, 21, 20, 1, 2, 6, 7, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public CompiladorSlothTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public CompiladorSlothTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
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
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffffe01L, 0x1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[22];
    private final int[] jjstateSet = new int[2 * 22];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
