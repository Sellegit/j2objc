package apple.mapkit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class MKAnnotationAdapter 
    extends Object 
    implements MKAnnotation {

    
    
    
    @NotImplemented("coordinate")
    public CLLocationCoordinate2D getCoordinate() { throw new UnsupportedOperationException(); }
    @Mapping("setCoordinate:")
    public void setCoordinate(CLLocationCoordinate2D v) { throw new UnsupportedOperationException(); }
    @NotImplemented("title")
    public String getTitle() { throw new UnsupportedOperationException(); }
    @NotImplemented("subtitle")
    public String getSubtitle() { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
