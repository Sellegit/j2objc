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
public abstract class GKChallengeListenerAdapter 
    extends Object 
    implements GKChallengeListener {

    
    
    


    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:wantsToPlayChallenge:")
    public void wantsToPlayChallenge(GKPlayer player, GKChallenge challenge) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:didReceiveChallenge:")
    public void didReceiveChallenge(GKPlayer player, GKChallenge challenge) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:didCompleteChallenge:issuedByFriend:")
    public void didCompleteChallenge(GKPlayer player, GKChallenge challenge, GKPlayer friendPlayer) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:issuedChallengeWasCompleted:byFriend:")
    public void issuedChallengeWasCompleted(GKPlayer player, GKChallenge challenge, GKPlayer friendPlayer) { throw new UnsupportedOperationException(); }

}
