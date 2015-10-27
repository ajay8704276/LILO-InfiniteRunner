package Implementation;

import FrameWork.Input;
import android.view.View;
import java.util.List;

/**
 * Created by Ajax on 10/27/2015.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
