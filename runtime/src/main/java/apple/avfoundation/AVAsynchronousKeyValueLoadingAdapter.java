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
public abstract class AVAsynchronousKeyValueLoadingAdapter 
    extends Object 
    implements AVAsynchronousKeyValueLoading {

    
    
    


    
    
    @NotImplemented("statusOfValueForKey:error:")
    public @Representing("AVKeyValueStatus") long getStatusOfValue(String key, Todo outError) { throw new UnsupportedOperationException(); }
    @NotImplemented("loadValuesAsynchronouslyForKeys:completionHandler:")
    public void loadValuesAsynchronously(NSArray<?> keys, @Block Runnable handler) { throw new UnsupportedOperationException(); }

}
