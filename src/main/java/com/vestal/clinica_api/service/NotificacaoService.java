package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Notificacao;
import com.vestal.clinica_api.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificacaoService {

    private final NotificacaoRepository repository;

    public NotificacaoService(NotificacaoRepository repository) {
        this.repository = repository;
    }

    public List<Notificacao> listarTodas() {
        return repository.findAll();
    }

    public Notificacao salvar(Notificacao n) {
        return repository.save(n);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
