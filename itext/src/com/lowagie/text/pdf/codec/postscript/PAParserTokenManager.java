/* Generated By:JavaCC: Do not edit this line. PAParserTokenManager.java */

/*
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 *
 * The Original Code is 'iText, a free JAVA-PDF library'.
 *
 * The Initial Developer of the Original Code is Bruno Lowagie. Portions created by
 * the Initial Developer are Copyright (C) 1999, 2000, 2001, 2002 by Bruno Lowagie.
 * All Rights Reserved.
 * Co-Developer of the code is Paulo Soares. Portions created by the Co-Developer
 * are Copyright (C) 2000, 2001, 2002 by Paulo Soares. All Rights Reserved.
 *
 * Contributor(s): all the names of the contributors are added in the source code
 * where applicable.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * LGPL license (the "GNU LIBRARY GENERAL PUBLIC LICENSE"), in which case the
 * provisions of LGPL are applicable instead of those above.  If you wish to
 * allow use of your version of this file only under the terms of the LGPL
 * License and not to allow others to use your version of this file under
 * the MPL, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the LGPL.
 * If you do not delete the provisions above, a recipient may use your version
 * of this file under either the MPL or the GNU LIBRARY GENERAL PUBLIC LICENSE.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the MPL as stated above or under the terms of the GNU
 * Library General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library general Public License for more
 * details.
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.lowagie.com/iText/
 *
 * This class is generated based on a grammar file privided by SUN, and updated
 * by Carsten Hammer.  SUN's license agreement can be found at this URL:
 * http://java.sun.com/products/java-media/2D/samples/samples-license.html
 * See also the file sun.txt in directory com.lowagie.text.pdf
 */

package com.lowagie.text.pdf.codec.postscript;

public class PAParserTokenManager implements PAParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}

private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 60:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 62:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 91:
         return jjStopAtPos(0, 18);
      case 93:
         return jjStopAtPos(0, 19);
      case 123:
         return jjStopAtPos(0, 16);
      case 125:
         return jjStopAtPos(0, 17);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 60:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 62:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec8 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 74;
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
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(0, 8);
                  }
                  else if ((0x100003610L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if ((0x8000281000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     jjCheckNAdd(21);
                  }
                  else if (curChar == 37)
                     jjCheckNAddStates(9, 14);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 26;
                  else if (curChar == 40)
                     jjCheckNAddStates(15, 17);
                  else if (curChar == 46)
                     jjCheckNAdd(6);
                  if (curChar == 45)
                     jjCheckNAddStates(18, 23);
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(23, 24);
                  else if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 1:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(3, 4);
                  break;
               case 5:
                  if (curChar == 46)
                     jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(24, 26);
                  break;
               case 8:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if (curChar == 40)
                     jjCheckNAddStates(15, 17);
                  break;
               case 12:
                  if ((0xfffffdffffffffffL & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 14:
                  if ((0x38000000400L & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 15:
                  if (curChar == 41 && kind > 10)
                     kind = 10;
                  break;
               case 16:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 30);
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 18:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(17);
                  break;
               case 20:
                  if ((0x8000281000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(21);
                  break;
               case 21:
                  if ((0x83ff681000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(21);
                  break;
               case 22:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 23:
                  if ((0x400800000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 24:
                  if ((0x8000281000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x83ff681000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(25);
                  break;
               case 26:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x8000281000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x83ff681000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 30:
                  if (curChar == 37)
                     jjCheckNAddStates(9, 14);
                  break;
               case 31:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 32:
                  if (curChar == 10 && kind > 2)
                     kind = 2;
                  break;
               case 33:
                  if ((0xffffffffffffdfffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 34:
                  if (curChar == 13 && kind > 3)
                     kind = 3;
                  break;
               case 35:
                  if ((0xffffffffffffdfffL & l) != 0L)
                     jjCheckNAddTwoStates(35, 37);
                  break;
               case 36:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 37:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 45)
                     jjCheckNAddStates(18, 23);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(39, 4);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 41:
                  if (curChar != 46)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(31, 33);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(31, 33);
                  break;
               case 44:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(45, 10);
                  break;
               case 46:
                  if (curChar == 46)
                     jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(34, 36);
                  break;
               case 49:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(50);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(50, 10);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 53:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(54);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(54, 10);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(37, 39);
                  break;
               case 57:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(58);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(58, 10);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(0, 8);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(60, 61);
                  break;
               case 61:
                  if (curChar != 46)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(40, 42);
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(40, 42);
                  break;
               case 64:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(65);
                  break;
               case 65:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(65, 10);
                  break;
               case 66:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(66, 67);
                  break;
               case 68:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(69);
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(69, 10);
                  break;
               case 70:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(43, 45);
                  break;
               case 72:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(73);
                  break;
               case 73:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(73, 10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 21:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(21);
                  break;
               case 2:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if ((0x100000001000L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 7:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(46, 47);
                  break;
               case 10:
                  if ((0x5000000050L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 12:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 13:
                  if (curChar == 92)
                     jjAddStates(48, 50);
                  break;
               case 14:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 24:
               case 25:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(25);
                  break;
               case 27:
               case 28:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(28);
                  break;
               case 31:
                  jjAddStates(51, 52);
                  break;
               case 33:
                  jjAddStates(53, 54);
                  break;
               case 35:
                  jjAddStates(55, 56);
                  break;
               case 43:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(57, 58);
                  break;
               case 48:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(59, 60);
                  break;
               case 52:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(61, 62);
                  break;
               case 56:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(63, 64);
                  break;
               case 63:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(65, 66);
                  break;
               case 67:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(67, 68);
                  break;
               case 71:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(69, 70);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 21:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(21);
                  break;
               case 12:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(15, 17);
                  break;
               case 24:
               case 25:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(25);
                  break;
               case 27:
               case 28:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(28);
                  break;
               case 31:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(51, 52);
                  break;
               case 33:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(53, 54);
                  break;
               case 35:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(55, 56);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 74 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}

private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 62:
         return jjStopAtPos(0, 23);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
private final int jjMoveNfa_1(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xbfffffffffffffffL & l) != 0L)
                     kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 22)
                     kind = 22;
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   39, 4, 60, 61, 66, 67, 70, 71, 10, 31, 32, 33, 34, 35, 37, 12, 
   13, 15, 39, 1, 40, 46, 51, 55, 6, 7, 10, 12, 13, 17, 15, 42, 
   43, 10, 47, 48, 10, 55, 56, 10, 62, 63, 10, 70, 71, 10, 8, 9, 
   14, 16, 18, 31, 32, 33, 34, 35, 37, 44, 45, 49, 50, 53, 54, 57, 
   58, 64, 65, 68, 69, 72, 73, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec8[i2] & l2) != 0L);
      default : 
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\173", "\175", "\133", "\135", "\74\74", "\76\76", null, null, 
"\74", };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "WITHINSTRING", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 
};
static final long[] jjtoToken = {
   0x1bf3d21L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoMore = {
   0x400000L, 
};
private JavaCharStream input_stream;
private final int[] jjrounds = new int[74];
private final int[] jjstateSet = new int[148];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
public PAParserTokenManager(JavaCharStream stream)
{
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public PAParserTokenManager(JavaCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 74; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

private final Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public final Token getNextToken() 
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
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
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
}

final void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 23 :
        if (image == null)
            image = new StringBuffer(new String(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1))));
         else
            image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             matchedToken.image=image.toString().substring(0,image.toString().length()-1);
         break;
      default : 
         break;
   }
}
}
