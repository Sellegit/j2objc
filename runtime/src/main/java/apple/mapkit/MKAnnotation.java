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





@Library("MapKit") @Mapping("MKAnnotation")
public interface MKAnnotation 
    extends NSObjectProtocol {

    
    
    @Mapping("coordinate")
    CLLocationCoordinate2D getCoordinate();
    @Mapping("setCoordinate:")
    void setCoordinate(CLLocationCoordinate2D v);
    @Mapping("title")
    String getTitle();
    @Mapping("subtitle")
    String getSubtitle();
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
