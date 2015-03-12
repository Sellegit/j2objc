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
public abstract class GKInviteEventListenerAdapter 
    extends Object 
    implements GKInviteEventListener {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:didAcceptInvite:")
    public void didAcceptInvite(GKPlayer player, GKInvite invite) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("player:didRequestMatchWithRecipients:")
    public void didRequestMatchWithRecipients(GKPlayer player, NSArray<?> recipientPlayers) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("player:didRequestMatchWithPlayers:")
    public void didRequestMatchWithPlayers(GKPlayer player, NSArray<?> playerIDsToInvite) { throw new UnsupportedOperationException(); }
    
}
