package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVCaptureMetadataOutputObjectsDelegateAdapter 
    extends Object 
    implements AVCaptureMetadataOutputObjectsDelegate {

    
    
    


    
    
    @NotImplemented("captureOutput:didOutputMetadataObjects:fromConnection:")
    public void didOutputMetadataObjects(AVCaptureOutput captureOutput, NSArray<?> metadataObjects, AVCaptureConnection connection) { throw new UnsupportedOperationException(); }

}
