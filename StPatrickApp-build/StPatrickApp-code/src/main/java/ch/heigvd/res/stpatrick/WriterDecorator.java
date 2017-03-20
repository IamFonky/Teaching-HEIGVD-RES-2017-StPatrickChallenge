package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by Fonky on 20.03.2017.
 */
public class WriterDecorator extends Writer
{

   Writer w;

   public WriterDecorator(Writer writer)
   {
      w = writer;
   }

   @Override
   public void write(char[] cbuf, int off, int len) throws IOException
   {
      w.write(cbuf,off,len);
   }

   @Override
   public void flush() throws IOException
   {
      w.flush();
   }

   @Override
   public void close() throws IOException
   {
      w.close();
   }
}
