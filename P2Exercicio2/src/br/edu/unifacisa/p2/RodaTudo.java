package br.edu.unifacisa.p2;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"br.edu.unifacisa.p2.facisaflix.testes", 
                 "br.edu.unifacisa.p2.logica.test", 
                 "br.edu.unifacisa.p2.romanos.test"})
public class RodaTudo {
}
