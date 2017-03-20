package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {

    switch (processorName)
    {
      case "e-remover":
        return new IStreamProcessor() {
          @Override
          public void process(Reader in, Writer out) throws IOException
          {
            int input;
            while((input = in.read()) != -1)
            {
              if((char)input != 'e' && (char)input != 'E')
              {
                out.write(input);
              }
            }
          }
        };
      default:
        throw new UnknownNameException("The factory does not know any processor called " + processorName);
    }
  }

}
