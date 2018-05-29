package resource;

import entities.AlunoEntity;
import model.Aluno;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.ok;

/**
 * Created by NeriDev on 29/05/2018.
 */

@Path("/aluno")
@Consumes("application/json; charset=UTF-8")
@Produces("application/json; charset=UTF-8")
public class AlunoREST {


    // teste iniical jersey

    @GET
    @Path("")
    public Response retornaAluno(){
        Aluno aluno = new Aluno();
        aluno.setId(1l);
        aluno.setMatricula(1213l);
        return ok(aluno).build();
    }
}
