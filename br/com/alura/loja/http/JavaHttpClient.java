package br.com.alura.loja.http;

import java.io.IOException;
import java.net.*;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {

        try {
            URL urlDaApi = new URI(url).toURL();
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {

            throw new RuntimeException("URL mal formatada", e);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Sintaxe da URL", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de input/output", e);
        }

    }
}
