package clc;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;


// Assume this is the external API interface
interface ExternalApi {
    String getData();
}

// This is the service that uses the external API
class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
