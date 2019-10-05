package jp.cordea.recyclerviewconstantspeedscrolldemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import jp.cordea.recyclerviewconstantspeedscrolldemo.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    private val viewModel by viewModels<FirstViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        binding.recyclerView.layoutManager = ConstantSpeedScrollLayoutManager(requireContext())
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.init()
        viewModel.scrollTo
            .observe(viewLifecycleOwner, Observer {
                binding.recyclerView.smoothScrollToPosition(it)
            })
    }
}
