import java.io.*;

class BeatlesException extends Exception {
    public BeatlesException(String message) {
        super("Beatles: " + message);
    }
}


public class Part4 {
    public static void main(String[] args) {

        String songlyrics = "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "So we sailed on to the sun\n" +
                "'Til we found a sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine";

        String filepath = "yellow_submarine.txt";

        try {
            saveSongToFile(songlyrics, filepath);
            String readLyrics = readSongFromFile(filepath);
            verifyStringInSong(readLyrics, "Show must go on");

        } catch (BeatlesException e) {
            System.out.println("Exception caught" + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O err" + e.getMessage());
        }
    }


    private static void saveSongToFile(String song, String filepath) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filepath));
            writer.write(song);
            System.out.println("Song successfully saved to file");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    private static String readSongFromFile(String filepath) throws IOException {
        StringBuilder song = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                song.append(line).append("\n");
            }
            System.out.println("Song successfully read from file");
        } catch (IOException e) {
            System.out.println("Err reading song " + e.getMessage());
        }
        return song.toString();
    }

    private static void verifyStringInSong(String song, String randomString) throws BeatlesException {
        if (!song.toLowerCase().contains(randomString.toLowerCase())) {
            throw new BeatlesException("The string\"" + randomString + "\" was found in the song");

        }
        System.out.println("the string \"" + randomString + "\" was not found in the song. ");
    }
}