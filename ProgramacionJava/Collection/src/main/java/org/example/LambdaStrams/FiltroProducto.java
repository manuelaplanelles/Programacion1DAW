package org.example.LambdaStrams;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@FunctionalInterface
public interface FiltroProducto {
    boolean filtrar(FiltroProducto producto);

}
