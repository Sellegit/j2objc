package apple.gamekit;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class GKMatchDelegateAdapter 
    extends Object 
    implements GKMatchDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("match:didReceiveData:fromRemotePlayer:")
    public void didReceiveData(GKMatch match, NSData data, GKPlayer player) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("match:didReceiveData:fromPlayer:")
    public void didReceiveData(GKMatch match, NSData data, String playerID) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("match:player:didChangeConnectionState:")
    public void didChangeConnectionState(GKMatch match, GKPlayer player, @Representing("GKPlayerConnectionState") long state) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("match:player:didChangeState:")
    public void didChangeState(GKMatch match, String playerID, @Representing("GKPlayerConnectionState") long state) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("match:didFailWithError:")
    public void didFail(GKMatch match, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("match:shouldReinviteDisconnectedPlayer:")
    public boolean shouldReinviteDisconnectedPlayer(GKMatch match, GKPlayer player) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("match:shouldReinvitePlayer:")
    public boolean shouldReinvitePlayer(GKMatch match, String playerID) { throw new UnsupportedOperationException(); }
    
}
