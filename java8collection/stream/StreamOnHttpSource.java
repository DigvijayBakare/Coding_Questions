package practice.java8collection.stream;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnHttpSource {
    public static void main(String[] args) throws IOException, InterruptedException {
        // The URI of the file
        URI uri = URI.create("https://www.gutenberg.org/files/98/98-0.txt");

        // The code to open create an HTTP request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).build();


        // The sending of the request
        HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());
        List<String> lines;
        try (Stream<String> stream = response.body()) {
            lines = stream.dropWhile(line -> !line.equals("A TALE OF TWO CITIES"))
                    .takeWhile(line -> !line.equals("*** END OF THE PROJECT GUTENBERG EBOOK A TALE OF TWO CITIES ***"))
                    .collect(Collectors.toList());
        }
        System.out.println("# lines = " + lines.size());

    }
}
