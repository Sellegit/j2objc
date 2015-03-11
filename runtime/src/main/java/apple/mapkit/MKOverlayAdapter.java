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

public abstract class MKOverlayAdapter 
    extends MKAnnotationAdapter 
    implements MKOverlay {

    
    
    
    @NotImplemented("coordinate")
    public CLLocationCoordinate2D getCoordinate() { throw new UnsupportedOperationException(); }
    @NotImplemented("boundingMapRect")
    public MKMapRect getBoundingMapRect() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("intersectsMapRect:")
    public boolean intersects(MKMapRect mapRect) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("canReplaceMapContent")
    public boolean canReplaceMapContent() { throw new UnsupportedOperationException(); }
    
}
