package io.github.toquery.example.java.soot;

import com.google.common.base.Optional;
import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.core.Flowable;
import org.junit.jupiter.api.Test;
import soot.ModulePathSourceLocator;
import soot.ModuleScene;
import soot.Scene;
import soot.SootClass;
import soot.options.Options;

import java.util.List;
import java.util.Map;

public class SootTests extends BaseTest {


    @Test
    public void testSoot() {
        String modulePath = "";
        // configure Soot's options, refer to example configurations below
        Options.v().set_soot_modulepath(modulePath);


// load classes from modules into Soot
// Here, getClassUnderModulePath() expects the module path to be set using the Options class as seen above
        Map<String, List<String>> map = ModulePathSourceLocator.v().getClassUnderModulePath(modulePath);
        for (String module : map.keySet()) {
            for (String klass : map.get(module)) {
                log.info("Loaded Class: " + klass + "\n");
                loadClass(klass, false, module);
                // the loadClass() method is defined below
            }
        }


//this must be called after all classes are loaded
        Scene.v().loadNecessaryClasses();




    }

    public static SootClass loadClass(String name, boolean main, String module) {
        SootClass c = ModuleScene.v().loadClassAndSupport(name, Optional.of(module));
        c.setApplicationClass();
        if (main)
            Scene.v().setMainClass(c);
        return c;
    }
}
