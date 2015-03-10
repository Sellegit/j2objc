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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("MapKit") @Mapping("MKTileOverlay")
public class MKTileOverlay 
    extends NSObject 
    implements MKOverlay {

    
    
    public MKTileOverlay() {}
    @Mapping("initWithURLTemplate:")
    public MKTileOverlay(String URLTemplate) { }
    
    
    @Mapping("tileSize")
    public native CGSize getTileSize();
    public native void setTileSize(CGSize v);
    @Mapping("isGeometryFlipped")
    public native boolean isGeometryFlipped();
    public native void setGeometryFlipped(boolean v);
    @Mapping("minimumZ")
    public native @MachineSizedSInt long getMinimumZ();
    public native void setMinimumZ(@MachineSizedSInt long v);
    @Mapping("maximumZ")
    public native @MachineSizedSInt long getMaximumZ();
    public native void setMaximumZ(@MachineSizedSInt long v);
    @Mapping("URLTemplate")
    public native String getURLTemplate();
    @Mapping("canReplaceMapContent")
    public native boolean canReplaceMapContent();
    public native void setCanReplaceMapContent(boolean v);
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("boundingMapRect")
    public native MKMapRect getBoundingMapRect();
    public native void setCoordinate(CLLocationCoordinate2D v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("subtitle")
    public native String getSubtitle();
    
    
    
    @Mapping("URLForTilePath:")
    public native NSURL getURL(MKTileOverlayPath path);
    @Mapping("loadTileAtPath:result:")
    public native void loadTile(MKTileOverlayPath path, @Block VoidBlock2<NSData, NSError> result);
    @Mapping("intersectsMapRect:")
    public native boolean intersects(MKMapRect mapRect);
    
}
