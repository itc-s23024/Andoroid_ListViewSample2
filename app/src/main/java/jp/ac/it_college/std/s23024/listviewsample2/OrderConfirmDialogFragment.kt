package jp.ac.it_college.std.s23024.listviewsample2


import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class OrderConfirmDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        val dialog = builder.run {
            // ダイアログのタイトル
            setTitle(R.string.dialog_title)
            // ダイアログのメッセージ
            setMessage(R.string.dialog_msg)
            // Positive ボタン
            setPositiveButton(R.string.dialog_btn_ok) { _, _ ->
                // Positive ボタンがタップされたとき
                Toast.makeText(
                    requireActivity(),
                    getString(R.string.dialog_ok_toast),
                    Toast.LENGTH_LONG
                ).show()
            }
            // Negative ボタン
            setNegativeButton(R.string.dialog_btn_ng) { _, _ ->
                // Negative ボタンがタップされたとき
                Toast.makeText(
                    requireActivity(),
                    getString(R.string.dialog_ng_toast),
                    Toast.LENGTH_LONG
                ).show()
            }
            // Neutral ボタン
            setNeutralButton(R.string.dialog_bth_nu) { _, _ ->
                // Neutral ボタンがタップされたとき
                Toast.makeText(
                    requireActivity(),
                    getString(R.string.dialog_nu_toast),
                    Toast.LENGTH_LONG
                ).show()
            }
            create()
        }
        return dialog
    }
}