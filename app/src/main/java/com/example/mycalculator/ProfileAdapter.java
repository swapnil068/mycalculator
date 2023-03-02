//package com.example.mycalculator;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {
//
//    public final ArrayList<Profile> dataListprofile;
//    Context context;
//
//    public ProfileAdapter(Context context, ArrayList<Profile> dataListprofile) {
//        this.dataListprofile = dataListprofile;
//        this.context = context;
//    }
//
//
//    @NonNull
//    @Override
//    public ProfileAdapter.ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.cardprofile, parent, false);
//        return new ProfileAdapter.ProfileViewHolder(view);
//    }
//
//    public int getItemViewType(int position) {
//        return position;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull ProfileAdapter.ProfileViewHolder holder, int position) {
////        holder.username.setText(dataListprofile.get(position).getTvusername());
////        holder.name.setText(dataListprofile.get(position).getTvname());
////        holder.email.setText(dataListprofile.get(position).getTvemail());
////        holder.dob.setText(dataListprofile.get(position).getTvDOB());
////        holder.phoneNo.setText(dataListprofile.get(position).getTvmobile());
////        holder.address.setText(dataListprofile.get(position).getTvaddress());
//        holder.editusername.setText(dataListprofile.get(position).getTveditusername());
//        holder.editname.setText(dataListprofile.get(position).getTveditname());
//        holder.editdob.setText(dataListprofile.get(position).getTveditDOB());
//        holder.editphoneNo.setText(dataListprofile.get(position).getTveditmobile());
//        holder.editemail.setText(dataListprofile.get(position).getTveditemail());
//        holder.editaddress.setText(dataListprofile.get(position).getTveditadderss());
//    }
//
//    @Override
//    public int getItemCount() {
//        return dataListprofile.size();
//    }
//
//    public class ProfileViewHolder extends RecyclerView.ViewHolder {
////        TextView username, name, dob, address, phoneNo, email;
//        EditText editusername, editname, editdob, editaddress, editphoneNo, editemail;
//
//        public ProfileViewHolder(@NonNull View itemView) {
//            super(itemView);
////            username = itemView.findViewById(R.id.username);
////            name = itemView.findViewById(R.id.name);
////            dob = itemView.findViewById(R.id.dob);
////            address = itemView.findViewById(R.id.address);
////            phoneNo = itemView.findViewById(R.id.mobile);
////            email = itemView.findViewById(R.id.email);
//
//            editusername = itemView.findViewById(R.id.editUsername);
//            editname = itemView.findViewById(R.id.editName);
//            editaddress = itemView.findViewById(R.id.editAddress);
//            editdob = itemView.findViewById(R.id.editDOB);
//            editphoneNo = itemView.findViewById(R.id.editMobile);
//            editemail = itemView.findViewById(R.id.Editemail);
//
//        }
//    }
//}
