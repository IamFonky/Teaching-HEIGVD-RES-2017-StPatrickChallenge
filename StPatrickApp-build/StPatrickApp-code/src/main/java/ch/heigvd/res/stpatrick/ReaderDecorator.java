package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/**
 * Created by Fonky on 20.03.2017.
 */
public class ReaderDecorator extends Reader
{
   Reader r;
   int length = 0;
   CharBuffer internalCB = null;

   public ReaderDecorator(Reader reader)
   {
      r = reader;
   }

   @Override
   public int read(char[] cbuf, int off, int len) throws IOException
   {
      return r.read(cbuf,off,len);
   }

   @Override
   public void close() throws IOException
   {
      r.close();
   }
}
