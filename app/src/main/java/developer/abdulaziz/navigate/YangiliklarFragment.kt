package developer.abdulaziz.navigate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import developer.abdulaziz.navigate.databinding.FragmentYangiliklarBinding
import kotlinx.android.synthetic.main.fragment_yangiliklar.*


class YangiliklarFragment : Fragment() {
    lateinit var binding: FragmentYangiliklarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentYangiliklarBinding.inflate(layoutInflater)

        binding.btnChiqish.setOnClickListener { 
            findNavController().navigate(R.id.homeFragment)
        }

        return binding.root
    }
}