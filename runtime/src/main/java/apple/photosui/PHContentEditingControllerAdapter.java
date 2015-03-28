package apple.photosui;


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
import apple.photos.*;
import apple.uikit.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class PHContentEditingControllerAdapter 
    extends Object 
    implements PHContentEditingController {

    
    
    
    @NotImplemented("shouldShowCancelConfirmation")
    public boolean shouldShowCancelConfirmation() { throw new UnsupportedOperationException(); }

    
    
    @NotImplemented("canHandleAdjustmentData:")
    public boolean canHandleAdjustmentData(PHAdjustmentData adjustmentData) { throw new UnsupportedOperationException(); }
    @NotImplemented("startContentEditingWithInput:placeholderImage:")
    public void startContentEditing(PHContentEditingInput contentEditingInput, UIImage placeholderImage) { throw new UnsupportedOperationException(); }
    @NotImplemented("finishContentEditingWithCompletionHandler:")
    public void finishContentEditing(@Block VoidBlock1<PHContentEditingOutput> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("cancelContentEditing")
    public void cancelContentEditing() { throw new UnsupportedOperationException(); }

}
