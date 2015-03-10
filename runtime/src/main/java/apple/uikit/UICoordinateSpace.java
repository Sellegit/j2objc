package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;





@Library("UIKit") @Mapping("UICoordinateSpace")
public interface UICoordinateSpace 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("bounds")
    CGRect getBounds();
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertPoint:toCoordinateSpace:")
    CGPoint convertPointToCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertPoint:fromCoordinateSpace:")
    CGPoint convertPointFromCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertRect:toCoordinateSpace:")
    CGRect convertRectToCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertRect:fromCoordinateSpace:")
    CGRect convertRectFromCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace);
    
    /*<adapter>*/
    /*</adapter>*/
}
