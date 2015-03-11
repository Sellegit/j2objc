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





@Library("PhotosUI") @Mapping("PHContentEditingController")
public interface PHContentEditingController 
    extends NSObjectProtocol {

    
    
    @Mapping("shouldShowCancelConfirmation")
    boolean shouldShowCancelConfirmation();
    
    
    @Mapping("canHandleAdjustmentData:")
    boolean canHandleAdjustmentData(PHAdjustmentData adjustmentData);
    @Mapping("startContentEditingWithInput:placeholderImage:")
    void startContentEditing(PHContentEditingInput contentEditingInput, UIImage placeholderImage);
    @Mapping("finishContentEditingWithCompletionHandler:")
    void finishContentEditing(@Block VoidBlock1<PHContentEditingOutput> completionHandler);
    @Mapping("cancelContentEditing")
    void cancelContentEditing();
    
    /*<adapter>*/
    /*</adapter>*/
}
