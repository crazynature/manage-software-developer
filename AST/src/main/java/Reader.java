



import java.io.*;

    public class Reader {


        public String getFile(String pathToFile) throws IOException{
            if(checkFileExists(pathToFile)) {
                BufferedReader inputStream = null;
                try {
                    inputStream = new BufferedReader(new InputStreamReader(
                            new FileInputStream(pathToFile), "UTF-8"));

                    int program;
                    String s = "";
                    while ((program = inputStream.read()) != -1) {
                        s += (char) program;
                    }
                    return s;
                } finally {
                    inputStream.close();
                }
            }

            return null;
        }

        private Boolean checkFileExists(String pathToFile) {
            File file = new File(pathToFile);
            if(file.exists())
                return true;
            else
                return false;
        }
    }

