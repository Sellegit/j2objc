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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UICoordinateSpaceAdapter 
    extends Object 
    implements UICoordinateSpace {

    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("bounds")
    public CGRect getBounds() { throw new UnsupportedOperationException(); }

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("convertPoint:toCoordinateSpace:")
    public CGPoint convertPointToCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("convertPoint:fromCoordinateSpace:")
    public CGPoint convertPointFromCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("convertRect:toCoordinateSpace:")
    public CGRect convertRectToCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("convertRect:fromCoordinateSpace:")
    public CGRect convertRectFromCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace) { throw new UnsupportedOperationException(); }

}
