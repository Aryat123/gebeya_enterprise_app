package gebeya.enterprise.app;

import java.util.ArrayList;


public class ClientController {
     ArrayList<Client> clients;

    public void addTalent(Client client)
    {
        clients.add(client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public String getTalents(String client)
    {
        return client;
    }

    
}

    

