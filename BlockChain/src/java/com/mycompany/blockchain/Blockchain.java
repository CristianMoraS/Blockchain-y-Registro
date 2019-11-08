package com.mycompany.blockchain;

import java.io.File;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.mycompany.blockchain.utility.*;

/**
 *
 * @author CristianM
 */
@WebService(serviceName = "Blockchain")
public class Blockchain {

    Lista list = new Lista();
    datos dt = new datos();
    String prehash;

    /**
     * This is a sample web service operation
     */
    @WebMethod()
    public void CrearBloque() {/*crear un bloque con la informacion recibida
         Nonce, Code, Data, hash, hash preview*/

        String datos = dt.code + dt.nonce + dt.data + dt.anthash + dt.posthash;
        File res = new File(datos);
        long bytes = res.length();
        Double peso = bytes / 1024.0;
        if (peso <= 0.5) {
            list.insertAtBegin(new Node(dt.getCode(), dt.getNonce(), dt.getData(), dt.getAnthash(), dt.getPosthash()));
        }
    }

    @WebMethod()
    public void RegistrarData(@WebParam(name = "txt") String txt, @WebParam(name = "nonce") int nonce, @WebParam(name = "hash") String hash) {     // toma los datos 
        int cont = 1;
        if (list.isEmpty()) {
            dt.setCode(cont);
            dt.setData(txt);
            dt.setNonce(nonce);
            dt.setAnthash("0000000000000000000000000000000000");
            dt.setPosthash(hash);
            cont++;
        } else {
            dt.setCode(cont);
            dt.setData(txt);
            dt.setNonce(nonce);
            if(list.returnUltimate() != null){
                prehash = list.returnUltimate().prehash;
            }
            dt.setAnthash(prehash);
            dt.setPosthash(hash);
        }
    }

    @WebMethod()
    public void ConsultarDir(@WebParam(name = "dir") String dir) {// revisa las direcciones
        
    }
}
