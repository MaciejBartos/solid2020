package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Emailable {
    void sendMessage(Contact emailable, String subject, String body);
}
