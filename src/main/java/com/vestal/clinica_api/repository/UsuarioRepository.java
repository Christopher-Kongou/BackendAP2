package com.vestal.clinica_api.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UsuarioRepository {

    @PersistenceContext
    private EntityManager em;

    public Map<String, Object> autenticar(String login) {

        StoredProcedureQuery query = em
                .createStoredProcedureQuery("sp_autenticar_usuario");

        query.registerStoredProcedureParameter("p_login", String.class, jakarta.persistence.ParameterMode.IN);
        query.setParameter("p_login", login);

        List<Object[]> resultList = (List<Object[]>) query.getResultList();

        if (resultList.isEmpty()) {
            return null;
        }

        Object[] row = resultList.get(0);

        Map<String, Object> map = new HashMap<>();
        map.put("usuario_id", row[0]);
        map.put("senha_hash", row[1]);
        map.put("tipo_usuario", row[2]);
        map.put("nome", row[3]);

        return map;
    }
}